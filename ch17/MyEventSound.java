package ch17;

import javax.swing.*;
import java.applet.AudioClip;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyEventSound extends JApplet implements ActionListener {
    private AudioClip audio;
    private JButton play,stop,loop;

    @Override
    public void init() {
        setLayout(new FlowLayout());
        audio = getAudioClip(getClass().getResource("polysixLFO.wav"));
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
