package ch17;

import javax.swing.*;
import java.awt.*;

public class FlowLayoutEx1 extends JFrame {
    public FlowLayoutEx1(){

        setTitle("FlowLayout Test");
        setSize(300,200);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        //frame의 기본은 BorderLayout
        //FlowLayout으로 변경
        setLayout(new FlowLayout());
//        setLayout(new FlowLayout(FlowLayout.LEFT,30,40));
        //왼쪽정렬,컴포넌트간의 좌우간격 30픽셀 상하간격 40픽셀

        add(new JButton("1"));
        add(new JButton("2"));
        add(new JButton("3"));
        add(new JButton("4"));
        add(new JButton("5"));
        setVisible(true);
    }

    public static void main(String[] args) {
        new FlowLayoutEx1();

    }
}
