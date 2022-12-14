package ch17;

import javax.swing.*;
import java.awt.*;

public class MyGridLayout extends JFrame {
    public MyGridLayout(){
        super("Gird Layout");
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        Container c = getContentPane();
        c.setLayout(new GridLayout(4,2));

        c.add(new JLabel("id :"));
        c.add(new JTextField(20));
        c.add(new JLabel("비밀번호 :"));
        c.add(new JPasswordField(20));
        c.add(new JLabel("이메일 :"));
        c.add(new JTextField( 20));
        c.add(new JLabel("전화번호"));
        c.add(new JTextField(20));

        setSize(500, 300);
        setVisible(true);
    }

    public static void main(String[] args) {
        new MyGridLayout();
    }
}
