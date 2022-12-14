package ch16;

import javax.swing.*;
import java.awt.*;

public class CountDownTest extends JFrame {
    private JLabel label;
    class MyThread extends  Thread{
        @Override
        public void run() {
            for (int i = 10; i >= 0; i--) {
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                label.setText(i + "");
            }
            System.exit(0);//자동종료
        }
    }
    public CountDownTest(){
        setTitle("카운트다운");
        setSize(300,200); //frame size
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //frame 닫기 처리

        label = new JLabel("Start");
        label.setFont(new Font("Serif", Font.BOLD, 100));
        add(label);
        (new MyThread()).start();//(new 생성자).start()
        setVisible(true);//화면 보이게 기본설정
    }

    public static void main(String[] args) {
        new CountDownTest();//참조변수 쓸 일 없으면 생성자만 호출 가능

    }
}
