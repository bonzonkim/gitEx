package ch17;

import javax.swing.*;

public class JFrameEx extends JFrame {
    //main에서 GUI코드 작성해도 되지만 extends Frame해서
    //기본생성자에서 GUI코드처리 하는게 바람직

    public JFrameEx(){
        super("JFrame 예제");//JFrame생성자 호출
        setSize(400,300);
        setVisible(true);
    }



    public static void main(String[] args) {
        new JFrameEx(); //객체생성겸 개본생성자 호출

    }
}
