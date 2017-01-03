package JavaSwing;

import java.awt.*;
import javax.swing.*;

public class Demo extends JFrame{
    Container a;
    Container b;
    Container c;
    Panel d;

    public Demo(){
        a = getContentPane();
        b = getContentPane();
        c = getContentPane();

        a.add(d,BOTTOM_ALIGNMENT);

        d.setLayout(new BorderLayout());
    }

    public static void main(String[] args) {
        Demo fenster = new Demo();

        fenster.setTitle("Ein Fenster");
        fenster.setSize(600, 300);
        fenster.setVisible(true);
        fenster.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}