package JavaSwing;

/**
 * Created by Benjamin Fani Sani on 18.11.16.
 */
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class FrameMitText extends JFrame implements ActionListener {

    Container c;
    JLabel label;
    Color hell = new Color(25,225,225);
    JButton tester = new JButton("tester");


    public FrameMitText(){
        c = getContentPane();
        c.setLayout(new FlowLayout());
        label = new JLabel("Label-Text im Frame");
        c.add(tester);
        tester.addActionListener(this);

    }

    public void actionPerformed(ActionEvent ae){
        if (ae.getSource()==tester){
            JOptionPane.showMessageDialog(c, "Eggs are not supposed to be green.");
        }
    }

    public static void main(String[] args) {
        FrameMitText fenster = new FrameMitText();

        fenster.setTitle("Ein Fenster");
        fenster.setSize(300,150);
        fenster.setVisible(true);
        fenster.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }
}
