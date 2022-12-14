package ch19;

import javax.swing.*;
import javax.xml.crypto.Data;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.net.Socket;
import java.util.Scanner;

public class MultiChatClient {
    static String nickName = null;
    static JTextArea area;
    static JTextField field;
    static DataOutputStream out;

    public static void main(String[] args) {
        nickName = JOptionPane.showInputDialog("대화명을 입력하세요");
        new ClientScreen(nickName);
        Socket socket;
        try {
            String serverIp = "localhost";
            //String serverIp = "192.168.0.101";
            // 소켓을 생성하여 연결을 요청
            socket = new Socket(serverIp, 7777);
            System.out.println("서버에 연결되었습니다");
            Thread receiveThread = new ClientReceiver(socket);
            receiveThread.start();
            Thread sender =
                    new ClientSender(socket, nickName);
            sender.start();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    //메세지 전송용 스레드 클래스
    static class ClientSender extends Thread{
        Socket socket;
        String name;

        public ClientSender(Socket socket, String name) {
            this.socket = socket;
            try{
                out = new DataOutputStream(socket.getOutputStream());
                this.name = name;
            }catch (Exception e){
                e.printStackTrace();
            }
        }

        @Override
        public void run() {
            Scanner sc = new Scanner(System.in);
            try{
                if (out != null) {
                    out.writeUTF(name); //대화명 보내기
                }
                while (out != null) {
                    out.writeUTF("["+name+"]"+sc.nextLine());
                }
            }catch (Exception e){
                e.printStackTrace();
            }
        }
    }
    static class ClientReceiver extends Thread{//메세지 수신용 클래스
        Socket socket;
        DataInputStream in;

        public ClientReceiver(Socket socket) {
            this.socket = socket;
            try {
                in = new DataInputStream(socket.getInputStream());
            }catch (Exception e){

            }
        }

        @Override
        public void run() {
            while (in != null) {
                try{
                    String str = in.readUTF();
                    System.out.println(str);
                    area.append(str+"\n");
                }catch (Exception e){
                    e.printStackTrace();
                }
            }
        }
    }

    //화면 구성용 클래스
    static class ClientScreen extends JFrame implements ActionListener {
        public ClientScreen(String nick){
            setSize(300, 500);
            setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
            setTitle(nick + "의 채팅방 클라이언트!");
            area = new JTextArea(25,40);
            field = new JTextField(25);
            field.addActionListener(this);
            JPanel panel = new JPanel();
            panel.setLayout(new BorderLayout());
            //패널의 배치방향 설정
            panel.setComponentOrientation(ComponentOrientation.LEFT_TO_RIGHT);
            JLabel label_name = new JLabel(nick + "님");
            panel.add(label_name,BorderLayout.WEST);
            panel.add(field,BorderLayout.CENTER);

            JScrollPane jspanel = new JScrollPane();
            panel.add(jspanel, BorderLayout.NORTH);
            jspanel.setViewportView(area);
            add(panel, BorderLayout.SOUTH);
            setVisible(true);
        }

        @Override
        public void actionPerformed(ActionEvent e) {
            if (e.getSource() == field) {
                try{
                    out.writeUTF("["+nickName+"]"+field.getText());
                    field.setText("");
                }catch (Exception e2){
                    e2.printStackTrace();
                }
            }
        }
    }
}
