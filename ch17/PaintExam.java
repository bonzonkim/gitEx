package ch17;

import javax.swing.*;
import java.awt.*;

public class PaintExam extends JFrame {
    public PaintExam(){
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setSize(500, 500);
        setVisible(true);
    }

    @Override
    public void paint(Graphics g) {
        super.paint(g); //JFrame paint method call
        g.drawString("Hello Java", 10, 60);
        g.drawOval(30, 100, 50, 50);
        g.setColor(Color.MAGENTA);
        g.fillOval(100, 100, 50, 50); //색채움
        g.setColor(Color.PINK);
        g.fillRect(200, 200, 60, 60);
        System.out.println("paint..");
    }

    public static void main(String[] args) {
        new PaintExam();
    }
}
