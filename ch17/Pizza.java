package ch17;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Pizza extends JFrame {
    public Pizza(){
        super("Pizza menu");
        setSize(500, 200);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        JPanel panel = new JPanel();
        JPanel panel1 = new JPanel();
        JPanel panel2 = new JPanel();

        panel.setBackground(Color.blue);
        panel1.setBackground(Color.cyan);
        panel2.setBackground(Color.red);

        JLabel label = new JLabel("피자 종류를 선택하세요");
        panel1.add(label);

        JButton button1 = new JButton("치즈");
        JButton button2 = new JButton("불고기");
        JButton button3 = new JButton("포테이토");
        JButton button4 = new JButton("종료");

        panel2.add(button1);
        panel2.add(button2);
        panel2.add(button3);
        panel2.add(button4);

        panel.add(panel1);
        panel.add(panel2);

        add(panel, "North");
        setVisible(true);

        //이벤트 처리
        //익명 클래스 (closure)
        ActionListener handler = new ActionListener() {

            //모달창 Dialog(경고,안내창)을 이벤트를 통해 출력
            //모달창 이란 본창(부모) 앞에 튀어나온 별도의 창(자식)
            //모달 == 자식
            @Override
            public void actionPerformed(ActionEvent e) {
                if (e.getActionCommand().equals("치즈")) {
                    JOptionPane.showMessageDialog(null,"치즈피자 선택하셨습니다 \n" +
                            "가격:23,000원","치즈피자",JOptionPane.INFORMATION_MESSAGE);
                } else if (e.getActionCommand().equals("불고기")) {
                    JOptionPane.showMessageDialog(null,"불고기피자 선택하셨습니다 \n"+
                            "가격:20,000원","불고기피자",JOptionPane.INFORMATION_MESSAGE);
                } else if (e.getActionCommand().equals("포테이토")) {
                    JOptionPane.showMessageDialog(null,"포테이토피자 선택하셨습니다 \n"+
                            "가격:22,000원","포테이토피자",JOptionPane.DEFAULT_OPTION);
                } else if (e.getActionCommand().equals("종료")) {
                    JOptionPane.showMessageDialog(null,"프로그램을 정말 종료하시겠습니까?","종료"
                            ,JOptionPane.OK_CANCEL_OPTION);
                    System.exit(0);
                }
            }
        };
        //버튼에 리스너를 부착해서 이벤트 핸들러를 호출해서 처리
        button1.addActionListener(handler);
        button2.addActionListener(handler);
        button3.addActionListener(handler);
        button4.addActionListener(handler);
    }

    public static void main(String[] args) {
        new Pizza();
    }

}
