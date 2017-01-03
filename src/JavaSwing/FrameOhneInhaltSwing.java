package JavaSwing;

import javax.swing.*;

/**
 * Created by Benjamin Fani Sani on 18.11.16.
 */

public class FrameOhneInhaltSwing{
    public static void main(String[] args) {

        FrameOhneInhalt fenster = new FrameOhneInhalt();

        fenster.setTitle("Ein schwules Fenster");
        fenster.setSize(300,150);
        fenster.setVisible(true);
        fenster.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }
}
