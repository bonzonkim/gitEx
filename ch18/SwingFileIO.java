package ch18;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class SwingFileIO extends JFrame implements ActionListener {
    Container cp;
    JButton btnSave,btnLoad;
    JTextArea ta;

    public SwingFileIO(String title){
        super(title);
        cp = this.getContentPane();//프레임위의 기본패널 설정
        this.setBounds(100,100,400,400);
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        this.setDesign();
        this.setVisible(true);

    }

    public void setDesign() {
        JPanel pTop = new JPanel();
        btnSave = new JButton("Save File");
        btnLoad = new JButton("Load File");
        pTop.add(btnSave);
        pTop.add(btnLoad);
        this.add("North", pTop);

        ta = new JTextArea();
        JScrollPane sp = new JScrollPane(ta);
        this.add("Center", sp);

        btnSave.addActionListener(this);
        btnLoad.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        Object ob = e.getSource();
        if (ob == btnSave) {
            FileDialog fd = new FileDialog(this,"Saving file",FileDialog.SAVE);
            fd.setVisible(true);
            String filename = fd.getDirectory()+fd.getFile();
            if (fd.getFile() == null) {
                return;
            }
            FileWriter fw = null;
            try{
                fw = new FileWriter("filename");
                fw.write(ta.getText());
                ta.setText("Saved");
                fw.close();
            }catch (IOException ex){
                ex.printStackTrace();
            }
        }else if(ob == btnLoad){
            FileDialog dlg = new FileDialog(this, "Open File", FileDialog.LOAD);
            dlg.setVisible(true);
            String filename = dlg.getDirectory() + dlg.getFile();
            if (dlg.getFile() == null)
                return;
            FileReader fr = null;
            try{
                fr = new FileReader(filename);
            }catch (IOException ex){
                ex.printStackTrace();
            }
            BufferedReader br = null;
            br = new BufferedReader(fr);
            ta.setText(""); //이전글을 초기화
            while (true) {
                String line = "";
                try{
                    line = br.readLine();
                }catch (IOException ex){
                    ex.printStackTrace();
                }
                if (line ==  null) break;
                ta.append(line + "\n");
            }
            try {
                br.close();
                fr.close();
            } catch (IOException exception) {
                exception.printStackTrace();
            }
        }

    }

    public static void main(String[] args) {
        new SwingFileIO("File I/O");
    }
}
