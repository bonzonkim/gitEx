package ch17;

import javax.swing.*;
import java.awt.*;
//JApplet : applet의 확장판
//라이프 사이클이 있음 init() -> start() -> stop() -> destroy()
//init()는 필수처리 나머지는 자동으로 처리됨

public class StringLine extends JApplet {
    @Override
    public void init() { //applet initialize
        getContentPane().setBackground(new Color(255, 255, 255));
        setSize(500, 500);
    }

    @Override
    public void paint(Graphics g) {
        super.paint(g);
        g.setColor(Color.magenta);
        g.drawLine(250,50,30,160);

        g.setColor(Color.pink);
        g.drawString("pink string", 10, 50);

        g.setColor(Color.yellow);
        g.drawString("yellow String", 10, 80);

        g.setColor(Color.blue);
        g.drawString("blue String", 10, 110);

    }


}
