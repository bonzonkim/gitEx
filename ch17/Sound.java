package ch17;

import javax.swing.*;
import java.applet.AudioClip;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Sound extends JApplet implements ActionListener {
    private AudioClip audio;
    private JButton play,stop,loop;

    @Override
    public void init() {
        setLayout(new FlowLayout());
        audio = getAudioClip(getClass().getResource("dingdong.wav"));
        play = new JButton("play");
        stop = new JButton("Stop");
        loop = new JButton("loop");
        add(play);
        add(stop);
        add(loop);

        play.addActionListener(this);
        stop.addActionListener(this);
        loop.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        JButton btn = (JButton)e.getSource();
        //getSource()는 object타입이라 형변환 필요
        System.out.println(e.getSource());
        if (btn == play) {
            audio.play();
        }
        if (btn == stop) {
            audio.stop();
        }
        if (btn == loop) {
            audio.loop();
        }
    }
}
