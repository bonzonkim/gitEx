package ch17;

import javax.swing.*;
import java.awt.*;

//이벤트 처리를 외부파일에서 구현
public class EventEx2 extends JFrame {
    private JButton button1, button2,button3,button4,button5,button6;
    public EventEx2(){
        setLayout(new FlowLayout());
        button1 = new JButton("Red");
        button2 = new JButton("Green");
        button3 = new JButton("Blue");
        button4 = new JButton("White");
        button5 = new JButton("Yellow");
        button6 = new JButton("Cyan");

        //프레임에 버튼 붙임
        add(button1);
        add(button2);
        add(button3);
        add(button4);
        add(button5);
        add(button6);

        //버튼에 이벤트 추가
        //버튼을 누르면 MyColorAction에서 구현한 actionPerformed()가 자동 호출
        //이벤트 핸들러를 외부클래스로 생성 및 호출을 통해서 구현
        button1.addActionListener(new MyColorAction(this,Color.RED));
        //this는 EventEx2자신의 객체를 가리킴 (JFrame타입)
        button2.addActionListener(new MyColorAction(this,Color.green));
        button3.addActionListener(new MyColorAction(this,Color.blue));
        button4.addActionListener(new MyColorAction(this,Color.white));
        button5.addActionListener(new MyColorAction(this,Color.YELLOW));
        button6.addActionListener(new MyColorAction(this,Color.CYAN));
        setSize(500,400);
        setVisible(true);
        setDefaultCloseOperation(DISPOSE_ON_CLOSE); //현재 창만닫음
    }

    public static void main(String[] args) {
        new EventEx2();
    }
}
