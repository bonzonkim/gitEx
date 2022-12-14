package 문제;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ex1 implements ActionListener {
    private JFrame f;
    private Color c;
    private Container con;

    public ex1(JFrame f, Color c) {
        this.f = f;
        con = f.getContentPane();
        this.c = c;
    }




    @Override
    public void actionPerformed(ActionEvent e) {

        con.setBackground(c);
    }

}

