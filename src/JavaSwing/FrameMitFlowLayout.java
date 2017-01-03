package JavaSwing;

import javax.swing.*;
import java.awt.*;
/**
 * Created by Benjamin Fani Sani on 18.11.16.
 */
public class FrameMitFlowLayout extends JFrame{

    Container c;
    JLabel l[] = new JLabel[4];

    public FrameMitFlowLayout() {
        c = getContentPane();
        c.setLayout(new FlowLayout());

        for (int i=0; i<4; i++){
            int rgbFg = 255 - i*70;
            int rgbBg = i*70;

            l[i] = new JLabel("Nummer " + (i));
            l[i].setForeground(new Color(rgbFg, rgbBg, rgbFg));
            l[i].setOpaque(true);
            c.add(l[i]);
        }
    }

    public static void main(String[] args) {
        FrameMitFlowLayout fenster = new FrameMitFlowLayout();

        fenster.setTitle("Ein Fenster");
        fenster.setSize(300,150);
        fenster.setVisible(true);
        fenster.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }
}
