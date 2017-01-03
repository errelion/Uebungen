package JavaSwing;

/**
 * Created by Benjamin Fani Sani on 21.11.16.
 */
import java.awt.*;
import javax.swing.*;

public class Vorlage extends JFrame{

    Container mainPanel;
    Container topPanel = new Container();
    Container botPanel = new Container();

    JLabel keyOneLabel = new JLabel("Schlüssel 1");
    JLabel keyTwoLabel = new JLabel("Schlüssel 2");
    JTextField keyOneField = new JTextField("Schlüssel 1");
    JTextField keyTwoField = new JTextField("Schlüssel 2");

    JLabel klartextLabel = new JLabel("Klartext");
    JLabel geheimtextLabel = new JLabel("Geheimtext");
    JTextArea klartext = new JTextArea("Klartext");
    JTextArea geheimtext = new JTextArea("Geheimtext");

    JButton toKlartext = new JButton("dechiffrieren");
    JButton toGeheimtext = new JButton("chiffrieren");

    public Vorlage(){
        mainPanel = getContentPane();

        mainPanel.setLayout(new BorderLayout());

        mainPanel.add(topPanel,BorderLayout.NORTH);
        mainPanel.add(botPanel,BorderLayout.SOUTH);

        topPanel.setLayout(new BorderLayout());

        topPanel.add(klartextLabel,BorderLayout.WEST);
        topPanel.add(klartext,BorderLayout.WEST);
        topPanel.add(geheimtextLabel,BorderLayout.EAST);
        topPanel.add(geheimtext,BorderLayout.EAST);

        botPanel.setLayout(new BorderLayout());

        botPanel.add(keyOneLabel,BorderLayout.EAST);
        botPanel.add(keyOneField,BorderLayout.EAST);
        botPanel.add(keyTwoLabel,BorderLayout.EAST);
        botPanel.add(keyTwoField,BorderLayout.EAST);

        botPanel.add(toKlartext,BorderLayout.CENTER);
        botPanel.add(toGeheimtext,BorderLayout.CENTER);
    }

    public static void main(String[] args) {

            Vorlage fenster = new Vorlage();

            fenster.setTitle("Ein Fenster");
            fenster.setSize(600, 300);
            fenster.setVisible(true);
            fenster.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        }

}
