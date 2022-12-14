package ch17;

import ch07.Car;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class CardEx extends JFrame {
    CardLayout card;
    Container con;
    public CardEx(){
        super("CardLayout Test");
        card = new CardLayout(); // 카드레이아웃 생성
        con = getContentPane(); // 프레임에 컨텐츠영역을 만들어줌
        setLayout(card);//레이아웃을 CardLayout으로 변경
        JPanel[] pan = new JPanel[5]; //패널 배열 5개
        Color[] color = {Color.red,Color.yellow,Color.green,
        Color.blue,Color.cyan}; // 컬러 배열 5개
        for (int i = 0; i < pan.length; i++) {
            pan[i] = new JPanel();
            pan[i].setBackground(color[i]); //패널의 색상
            add("card" + i, pan[i]);
            //패널에 마우스 이벤트 추가
            pan[i].addMouseListener(new MouseAdapter() {
                public void mouseClicked(MouseEvent event) {
                    card.next(con);//다음 화면으로 이동 시켜줌
                }
            });
            setSize(500, 500);
            setVisible(true);
            setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        }
    }

    public static void main(String[] args) {
        new CardEx();
    }
}
