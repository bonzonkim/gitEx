package ch19;

import javax.swing.*;
import java.awt.*;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;


class ServerScreen extends JFrame {
    JTextArea area;
    JTextField field;

    public ServerScreen(){
        setSize(400, 400);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setTitle("Chat Server!");
        JLabel label = new JLabel("This is a server");
        add(label, BorderLayout.NORTH);
        setVisible(true);
    }
}



public class MultiChatServer {
    HashMap userMap;

    public MultiChatServer(){
        userMap = new HashMap();
        Collections.synchronizedMap(userMap);
    }

    public static void main(String[] args) {
        new ServerScreen();
        new MultiChatServer().serviceStart();
    }

    public void serviceStart() {
        ServerSocket serverSocket = null;
        Socket socket = null;
        try{
            serverSocket = new ServerSocket(7777);
            System.out.println("서버가 시작되었습니다");
            while (true) {
                socket = serverSocket.accept();
                System.out.println("["+socket.getInetAddress()+"]"+" 에서 접속하셨습니다");
                //클라이언트별로 메시지 수신을 위한 스레드 생성
                //10명이 접속하면 10개의 스레드 생성
                ServerReceiver receiveThread = new ServerReceiver(socket);
                receiveThread.start();
                System.out.println("현재 실행중인 스레드 name : " + receiveThread.getName());
            }
        }catch (Exception e){
            e.printStackTrace();
        }
    }//end serviceStart()

    void sendToAll(String msg) {
        Iterator it = userMap.keySet().iterator();
        while (it.hasNext()) {
            try{
                //메세지 전송을 위한 출력스트림 생성
                DataOutputStream out = (DataOutputStream) userMap.get(it.next());
                out.writeUTF(msg); //메세지 전송
            }catch (Exception e){
                e.printStackTrace();
            }
        }
    }
    class ServerReceiver extends Thread {
        Socket socket;
        DataInputStream in;
        DataOutputStream out;

        public ServerReceiver(Socket socket){
            this.socket = socket;
            try{
                in = new DataInputStream(socket.getInputStream());
                out = new DataOutputStream(socket.getOutputStream());
            }catch (Exception e){
                System.out.println("ServerReceiver 소켓 IO error");
                e.printStackTrace();
            }
        }

        @Override
        public void run() {
            String name = "";
            try{
                name = in.readUTF(); //메세지 수신
                sendToAll("#" + name + "님이 들어오셨습니다");//메세지 보내기
                userMap.put(name, out);
                System.out.println("현재 접속자 수는 " + userMap.size() + "입니다");
                while (in != null) {
                    sendToAll(in.readUTF());
                }
            }catch (Exception e){
                e.printStackTrace();
            }finally {
                //대화방을 나간 사용자의 정보 출력
                sendToAll("#" + name + "님이 나가셨습니다");
                userMap.remove(name);
                System.out.println("["+socket.getInetAddress()+
                        ":"+socket.getPort()+"] 에서 접속 종료함");
                System.out.println("현재 접속자 수는 " + userMap.size() + "입니다");
            }
        }
    }
}
