package ch17;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyColorAction implements ActionListener {
    private JFrame f;
    private Color c;
    private Container con; //다른 컴포넌트를 담을 수 있는 요소
    //contentpane : 스윙에서는 contentPane에 컴포넌트를 부착함
    //contentPane는 JFrame객체가 처음 생길때 자동으로 생성됨
    //getContentPane()메소드 사용해 얻을 수 있다.

    public MyColorAction(JFrame f, Color c){
        this.f = f;
        con = f.getContentPane();//프레임의 컨텐츠 영역
        this.c = c;
    }



    @Override
    public void actionPerformed(ActionEvent e) {
        con.setBackground(c); //배경색상 변경
    }
}
