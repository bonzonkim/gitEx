package ch17;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyEvent extends JFrame  {

    public MyEvent(){

       JButton button1 = new JButton("red");
       JButton button2 = new JButton("green");
       JButton button3 = new JButton("blue");
       JButton button4 = new JButton("yellow");
      JButton button5 = new JButton("center");

        add(button1, "North");
        add(button2, "East");
        add(button3, "South");
        add(button4, "West");
        add(button5, "Center");


        button1.addActionListener(new MyEventColor(this,button5,Color.red));
        button2.addActionListener(new MyEventColor(this,button5,Color.green));
        button3.addActionListener(new MyEventColor(this,button5,Color.blue));
        button4.addActionListener(new MyEventColor(this,button5,Color.yellow));

        setSize(500, 400);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        new MyEvent();
    }


}
