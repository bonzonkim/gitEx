package ch17;

import javax.swing.*;

//public class FontExam extends JApplet {
//    private Font font;
//    private FontMetrics fm;
//    private String message;
//    private Dimension dim;
//    private int x,y;
//
//
//    public void init() {
//        message = "그래픽 테스트";
//        font = new Font("굴림",Font.ITALIC,30);
//        fm = getFontMetrics(font);
//        setSize(500,500);
//        dim = getSize();
//        System.out.println(dim.width);
//        System.out.println(dim.height);
//
//        x=(dim.width/2)-(fm.stringWidth(message)/2);
//        y=(dim.width/2)-(fm.getDescent()/2);
//    }
//
//    public void paint(Graphics g) {
//        super.paint(g);
//        g.setFont(font);
//
//        g.drawString(message,x,y);
//    }
//}
//
