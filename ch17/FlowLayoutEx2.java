package ch17;

import javax.swing.*;
import java.awt.*;

public class FlowLayoutEx2 extends JFrame {
    JPanel jp; //JPanel 변수 선언
    JButton jb1,jb2,jb3,jb4,jb5,jb6; //JButton

    public FlowLayoutEx2() {
        super("FlowLayout Test");
        jp = new JPanel();
        jb1 = new JButton("button1");
        jb2 = new JButton("button2");
        jb3 = new JButton("button3");
        jb4 = new JButton("button4");
        jb5 = new JButton("button5");
        jb6 = new JButton("button6");
        jp.add(jb1); //패널에 버튼 붙이기
        jp.add(jb2);
        jp.add(jb3);
        jp.add(jb4);
        jp.add(jb5);
        jp.add(jb6);

        //패널을 FlowLayout으로 설정
        //jp.setLayout(new FlowLayout()); //패널의 기본레이아웃은 FlowLayout이라 생략가능
        add(jp, "North");
        setSize(600, 500);
        setVisible(true);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        new FlowLayoutEx2();
    }
}
