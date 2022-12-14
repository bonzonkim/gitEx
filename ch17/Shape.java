package ch17;

import javax.swing.*;
import java.awt.*;

public class Shape extends JApplet {
    @Override
    public void init() {
        setSize(500, 500);
    }

    @Override
    public void paint(Graphics g) {
        super.paint(g);
        Graphics2D g2 = (Graphics2D)g;
        g2.setStroke(new BasicStroke(5)); //선 굵기
        g.drawLine(10, 10, 200, 10);

        g.setColor(Color.yellow);
        g2.setStroke(new BasicStroke(1));
        g.drawRect(120, 40, 90, 50);

        g.setColor(Color.magenta);
        g.fillRect(120,40,90,50);

        g.setColor(Color.pink);
        g.fillRoundRect(120, 240, 90, 50, 30, 30);

        g.setColor(Color.blue);
        g.fillOval(0,40,90,55);

        int[] x = {10, 30, 50, 40, 20};
        int[] y = {257, 240, 257, 280, 280};

        //x배열,y배열,꼭짓점의 수=x배열의 길이
        g.fillPolygon(x, y, x.length);//다각형 그리기

    }

    public static void main(String[] args) {
        new Shape();
    }
}
