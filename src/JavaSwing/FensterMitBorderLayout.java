package JavaSwing;
import java.awt.*;
import javax.swing.*;
/**
 * Created by Benjamin Fani Sani on 21.11.16.
 */
public class FensterMitBorderLayout extends JFrame {

    Container c;
    JButton b[] = new JButton[5];

    public FensterMitBorderLayout() {
        c = getContentPane();
        c.setLayout(new BorderLayout());

        b[0] = new JButton("south");
        b[1] = new JButton("north");
        b[2] = new JButton("center");
        b[3] = new JButton("west");
        b[4] = new JButton("east");

        c.add(b[0], BorderLayout.SOUTH);
        c.add(b[1], BorderLayout.NORTH);
        c.add(b[2], BorderLayout.CENTER);
        c.add(b[3], BorderLayout.WEST);
        c.add(b[4], BorderLayout.EAST);

        b[0].setPreferredSize(new Dimension(50,300));
    }

    public static void main(String[] args) {
        FensterMitBorderLayout fenster = new FensterMitBorderLayout();

        fenster.setTitle("Ein Fenster");
        fenster.setSize(300, 150);
        fenster.setVisible(true);
        fenster.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);


    }
}
