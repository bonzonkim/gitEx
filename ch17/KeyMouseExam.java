package ch17;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class KeyMouseExam extends JApplet implements MouseListener, MouseMotionListener, KeyListener {
    private int x,y;
    private int width, height;
    private Image img;
        private boolean flag = false;


    @Override
    public void init() {
        setSize(500, 500);
        //이미지 불러오기
        img = Toolkit.getDefaultToolkit().getImage(getClass().getResource("car.gif"));
        //현재 클래스에 마우스 이벤트 기능을 추가
        this.addMouseListener(this);
        this.addMouseMotionListener(this);
        this.addKeyListener(this);
        //키입력을 받을 수 있도록 설정
        setFocusable(true);
        //현재화면에 키 입력 요청
        requestFocus();
    }

    @Override
    public void paint(Graphics g) { //화면 출력
        super.paint(g);
        //이미지의 가로세로 길이 계산
        width = img.getWidth(null);
        System.out.println(width + "," + height);

        if (flag) { //마우스 클릭하면 true가 됨
            g.drawImage(img,x,y,this);

        }
    }

    @Override
    public void keyTyped(KeyEvent e) {

    }

    @Override
    public void keyPressed(KeyEvent e) {
        System.out.println(e.getKeyCode());
        System.out.println(e.getKeyChar());

        switch (e.getKeyCode()) {
            case KeyEvent.VK_UP: //위쪽키 누르면
                y = Math.max(0, y - 5); break;
            case KeyEvent.VK_DOWN:
                y = Math.min(500 - height, y + 5); break;
            case KeyEvent.VK_LEFT:
                x = Math.max(0, x - 5); break;
            case KeyEvent.VK_RIGHT:
                x = Math.min(500 - width, x + 5); break;
        }
        repaint();
    }

    @Override
    public void keyReleased(KeyEvent e) {

    }

    //컴포넌트상에서 마우스 버튼을 눌렀다 놓았을때 호출
    @Override
    public void mouseClicked(MouseEvent e) {
        flag = true;
        x = e.getX(); //x좌표값 저장
        y = e.getY(); //y좌표값 저장
        //그래픽 갱신 요엋ㅇ => paint()를 자동호출
        repaint();
    }

    @Override
    public void mousePressed(MouseEvent e) {

    }

    @Override
    public void mouseReleased(MouseEvent e) {

    }

    @Override
    public void mouseEntered(MouseEvent e) {
        //마우스가 컴포넌트에 들어갔을때 호출
    }

    @Override
    public void mouseExited(MouseEvent e) {
        //마우스가 컴포넌트를 종료하면 호출
    }

    @Override
    public void mouseDragged(MouseEvent e) {
        System.out.println("mouse drag : x :" + x + ", y :" + y);
    }

    @Override
    public void mouseMoved(MouseEvent e) {
        x = e.getX();
        y = e.getY();
        System.out.println("mouse drag : x :" + x + ", y :" + y);
        repaint();
    }
}
