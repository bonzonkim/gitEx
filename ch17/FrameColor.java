package ch17;

import javax.swing.*;
import java.awt.*;

public class FrameColor extends JFrame {
    public FrameColor() throws InterruptedException {
        setVisible(true);
        Container c = getContentPane();//프레임에 컨텐츠 영역표시
        for (int i = 0; i <= 255; i++) {
            setSize(i*2,i); //프레임 사이즈
            setLocation(i*2,i); //프레임 좌표
            c.setBackground(new Color(i,0,0));//background color
            Thread.sleep(10);
        }
        for (int i = 0; i <= 255; i++) {
            setSize(i*2,i); //프레임 사이즈
            setLocation(i*2,i); //프레임 좌표
            c.setBackground(new Color(255,i,0));//background color
            Thread.sleep(10);
        }
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        //창닫으면 프로그램 종료
    }






    public static void main(String[] args) throws InterruptedException {
        new FrameColor();
    }

}
