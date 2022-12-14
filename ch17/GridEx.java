package ch17;

import javax.swing.*;
import java.awt.*;

public class GridEx extends JFrame {
    public GridEx(){
        super("GridLayout Test");
        setLayout(new GridLayout(2, 3));//2행 3열
        JButton bt1 = new JButton("button1");
        JButton bt2 = new JButton("button2");
        JButton bt3 = new JButton("button3");
        JButton bt4 = new JButton("button4");
        JButton bt5 = new JButton("button5");
        JButton bt6 = new JButton("button6");


        add(bt1);
        add(bt2);
        add(bt3);
        add(bt4);
        add(bt5);
        add(bt6);

        setSize(500, 500);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setVisible(true);
    }

    public static void main(String[] args) {
        new GridEx();
    }
}
