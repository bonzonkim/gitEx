package ch17;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TextAreaEx extends JFrame {
    //text field = 한줄짜리
    private JTextField tf = new JTextField(20);
    //6행 20열의 입력창 생성
    private JTextArea ta = new JTextArea(6,20);

    public TextAreaEx(){
        super("TextArea test");
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        Container c = getContentPane();
        c.setLayout(new FlowLayout());
        c.add(new JLabel("입력 후 <Enter> 키를 입력하세요."));
        c.add(tf);
        c.add(new JScrollPane(ta));

        tf.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JTextField t = (JTextField)e.getSource();
                ta.append(t.getText() + "\n");
                //텍스트필드의 문자열을 textarea영역으로 옮김
                t.setText("");//현재 텍스트필드의 내용 지우기
            }
        });
        setSize(500, 400);
        setVisible(true);
    }

    public static void main(String[] args) {
        new TextAreaEx();
    }
}
