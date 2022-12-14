package ch12;

import java.awt.*; //GUI전용 클래스
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
//frame : 윈도우 창을 띄워주는 클래스

public class InnerExam extends Frame {
    public InnerExam(){
        super("내부클래스 테스트");
        setSize(600,500);
        setVisible(true);
    }

    public static void main(String[] args) {
        InnerExam i = new InnerExam();
        i.addWindowListener(new WindowListener() {
            @Override
            public void windowOpened(WindowEvent e) {

            }

            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0);//프로그램종료
            }

            @Override
            public void windowClosed(WindowEvent e) {

            }

            @Override
            public void windowIconified(WindowEvent e) {

            }

            @Override
            public void windowDeiconified(WindowEvent e) {

            }

            @Override
            public void windowActivated(WindowEvent e) {

            }

            @Override
            public void windowDeactivated(WindowEvent e) {

            }
        });
    }
}
