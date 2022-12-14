package 문제;

import javax.swing.*;
import java.awt.*;

public class ex11 extends JFrame {
    public ex11() {
        Button b1 = new Button("North");
        Button b2 = new Button("East");
        Button b3 = new Button("South");
        Button b4 = new Button("West");

        add(b1, "North");
        add(b2, "East");
        add(b3, "South");
        add(b4, "West");

        b1.addActionListener(new ex1(this, Color.RED));
        b2.addActionListener(new ex1(this, Color.GREEN));
        b3.addActionListener(new ex1(this, Color.BLUE));
        b4.addActionListener(new ex1(this, Color.YELLOW));

        setSize(500, 400);
        setVisible(true);
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);

    }
    public static void main(String[] args) {
        new ex11();
    }
}
