package ch17;

import javax.swing.*;
import java.awt.*;
import java.util.Random;

public class RandomLine extends JApplet {
    private Random random;

    @Override
    public void init() {
        setSize(500, 500);
        random = new Random();
    }

    @Override
    public void paint(Graphics g) {
        super.paint(g);
        for (int i = 0; i < 100; i++) {
            int red = random.nextInt(256);
            int green = random.nextInt(256);
            int blue = random.nextInt(256);
            g.setColor(new Color(red,green,blue));

            int x1 = random.nextInt(300);
            int y1 = random.nextInt(300);
            int x2 = random.nextInt(300);
            int y2 = random.nextInt(300);

            g.drawLine(x1,y1,x2,y2);
        }

    }
}
