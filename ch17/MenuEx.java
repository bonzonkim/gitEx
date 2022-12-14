package ch17;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MenuEx extends JFrame {

    //"exit만 메뉴아이템으로 별도 생성
    private JMenuItem exit = new JMenuItem("Exit");
    public MenuEx(){
        super("Menu test");
        createMenu();
        setSize(300, 200);
        setVisible(true);

    }

    public void createMenu() {
        JMenuBar mb = new JMenuBar(); //메뉴바
        JMenu jm = new JMenu("File"); //"file 메뉴 생성
        jm.add(new JMenuItem("Open"));
        jm.add(new JMenuItem("Save"));
        jm.add(new JMenuItem("Print"));
        jm.addSeparator();
        jm.add(exit);
        mb.add(jm);
        mb.add(new JMenu("Edit"));
        mb.add(new JMenu("Project"));
        mb.add(new JMenu("Run"));

        //attach menubar to frame
        setJMenuBar(mb);

        exit.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
                //메뉴아이템 exit을누르면 프로그램 종료
            }
        });

    }

    public static void main(String[] args) {
        new MenuEx();
    }
}
