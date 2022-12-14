package ch17;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class MyEventImg extends JApplet implements MouseListener, MouseMotionListener, KeyListener {
    private int x,y;
    private int width, height;
    private Image img;
    private boolean flag = false;


    @Override
    public void init() {
        setSize(500, 500);
        img = Toolkit.getDefaultToolkit().getImage(getClass().getResource("spttedHyena.jpg"));

        this.addMouseListener(this);
        this.addMouseMotionListener(this);
        this.addKeyListener(this);

        setFocusable(true);

        requestFocus();
    }

    @Override
    public void paint(Graphics g) {
        super.paint(g);

        width = img.getWidth(null);
        System.out.println(width + "," + height);

        if (flag) {
            g.drawImage(img,x,y,this);

        }
    }

    @Override
    public void keyTyped(KeyEvent e) {

    }

    @Override
    public void keyPressed(KeyEvent e) {
        System.out.println(e.getKeyCode());
        System.out.println(e.getKeyChar());

        switch (e.getKeyCode()) {
            case KeyEvent.VK_UP:
                y = Math.max(0, y - 5); break;
            case KeyEvent.VK_DOWN:
                y = Math.min(500 - height, y + 5); break;
            case KeyEvent.VK_LEFT:
                x = Math.max(0, x - 5); break;
            case KeyEvent.VK_RIGHT:
                x = Math.min(500 - width, x + 5); break;
        }
        repaint();
    }

    @Override
    public void keyReleased(KeyEvent e) {

    }


    @Override
    public void mouseClicked(MouseEvent e) {
        flag = true;
        x = e.getX();
        y = e.getY();

        repaint();
    }

    @Override
    public void mousePressed(MouseEvent e) {

    }

    @Override
    public void mouseReleased(MouseEvent e) {

    }

    @Override
    public void mouseEntered(MouseEvent e) {

    }

    @Override
    public void mouseExited(MouseEvent e) {

    }

    @Override
    public void mouseDragged(MouseEvent e) {
        System.out.println("mouse drag : x :" + x + ", y :" + y);
    }

    @Override
    public void mouseMoved(MouseEvent e) {
        x = e.getX();
        y = e.getY();
        System.out.println("mouse drag : x :" + x + ", y :" + y);
        repaint();
    }
}
