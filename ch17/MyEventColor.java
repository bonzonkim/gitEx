package ch17;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyEventColor  implements ActionListener {
    private JFrame frame;
    private Color color;
    private JButton button;
    private Container container;

    public MyEventColor(JFrame frame,JButton jb,Color c){
        this.frame = frame;
        color = c;
        button = jb;
        container = frame.getContentPane();

}

    @Override
    public void actionPerformed(ActionEvent e) {

        button.setOpaque(true);
        button.setBackground(color);
    }
}
