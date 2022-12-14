package ch17;

import javax.swing.*;
import java.awt.*;

public class PanelExam extends JFrame {
    public PanelExam(){ //기본생성자에서 GUI코드 작성 권장
        //패널에는 2개 이상의 컴포넌트를 배치할 수 있다.
        //버튼에 패널을 추가후 패널을 프레임에 붙임
        JPanel p =new JPanel();
        p.setBackground(Color.red);//패널의 배경 색상
        //버튼 생성
        JButton button1 = new JButton("버튼1");
        JButton button2 = new JButton("버튼2");
        JButton button3 = new JButton("버튼3");
        JButton button4 = new JButton("버튼4");
        JButton button5 = new JButton("버튼5");
        JButton button6 = new JButton("버튼6");

        p.add(button1);//패널에 버튼을 추가
        p.add(button6);

        //보더레이아웃에 버튼 추가
        add(p, BorderLayout.NORTH);
        add(button2); //위치 생략 center에 배치됨
        add(button3, "South");
        add(button4, "West");
        add(button5, "East");

        setSize(300,300);
        setVisible(true);
        //닫기 버튼 눌렀을때 프로그램 완전 종료
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        new PanelExam();
    }
}
