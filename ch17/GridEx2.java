package ch17;

import javax.swing.*;
import java.awt.*;

public class GridEx2 extends JFrame {
    public GridEx2(){
        super("GridLayout Test");
        setLayout(new GridLayout(3,3));
        setSize(500, 500);
        for (int i = 1; i <= 9; i++) {
            JButton button = new JButton("버튼"+i);
            //for문으로 버튼 9개 생성
            add(button);
        }
        setVisible(true);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        new GridEx2();
    }
}
