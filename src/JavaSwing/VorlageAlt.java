package JavaSwing;

/**
 * Created by Benjamin Fani Sani on 21.11.16.
 */
import java.awt.*;
import javax.swing.*;

public class VorlageAlt extends JFrame{

    Container mainPanel;
    Container topPanel = new Container();
    Container botPanel = new Container();
    Container botTextFields = new Container();
    Container botButtons = new Container();

    JTextField keyOneField = new JTextField("Schlüssel 1");
    JTextField keyTwoField = new JTextField("Schlüssel 2");

    JTextArea klartext = new JTextArea("Klartext");
    JTextArea geheimtext = new JTextArea("Geheimtext");

    JButton toKlartext = new JButton("dechiffrieren");
    JButton toGeheimtext = new JButton("chiffrieren");
    JButton exit = new JButton("Exit");

    public VorlageAlt(){
        mainPanel = getContentPane();
        mainPanel.setLayout(new BorderLayout());

        mainPanel.add(topPanel,BorderLayout.NORTH);
        mainPanel.add(botPanel,BorderLayout.SOUTH);

        topPanel.setLayout(new BorderLayout());
        topPanel.add(geheimtext,BorderLayout.WEST);
        topPanel.add(klartext,BorderLayout.CENTER);
        topPanel.add(exit,BorderLayout.EAST);

        geheimtext.setBorder(BorderFactory.createEtchedBorder());
        geheimtext.setLineWrap(true);
        geheimtext.setWrapStyleWord(true);

        klartext.setBorder(BorderFactory.createEtchedBorder());
        klartext.setLineWrap(true);
        klartext.setWrapStyleWord(true);

        int textSizeX = 200;
        int textSizeY = 100;
        geheimtext.setPreferredSize(new Dimension(textSizeX,textSizeY));
        klartext.setPreferredSize(new Dimension(textSizeX,textSizeY));


        botPanel.setLayout(new BorderLayout());
        botPanel.add(botTextFields,BorderLayout.WEST);
        botPanel.add(botButtons,BorderLayout.EAST);
        botPanel.setPreferredSize(new Dimension(200,100));

        botTextFields.setLayout(new BorderLayout());
        botTextFields.add(keyOneField,BorderLayout.NORTH);
        botTextFields.add(keyTwoField,BorderLayout.SOUTH);

        int keyFieldSizeX = 300;
        int keyFieldSizeY = 30;
        keyOneField.setPreferredSize(new Dimension(keyFieldSizeX,keyFieldSizeY));
        keyTwoField.setPreferredSize(new Dimension(keyFieldSizeX,keyFieldSizeY));

        botButtons.setLayout(new BorderLayout());
        botButtons.add(toGeheimtext,BorderLayout.NORTH);
        botButtons.add(toKlartext,BorderLayout.SOUTH);

    }

    public static void main(String[] args) {
        VorlageAlt fenster = new VorlageAlt();


        fenster.setTitle("Ein Fenster");
        fenster.setSize(500, 250);
        fenster.setVisible(true);
        fenster.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
