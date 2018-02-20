package HS12;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.*;

public class Opdracht6_HS12 extends Applet{
    TextField tekstvak;
    Button buttonOke;

    boolean knopGeklikt;
    boolean gevonden;
    int[] waarde = {0, 1, 2, 2, 3, 3, 3, 4, 4, 5};
    int invoer;
    int aantal;

    public void init() {
        tekstvak = new TextField("", 5);
        add(tekstvak);

        buttonOke = new Button();
        buttonOke.setLabel(" Oke ");
        ButtonListener bl = new ButtonListener();
        buttonOke.addActionListener(bl);
        add(buttonOke);
    }

    public void paint(Graphics g) {
        if (knopGeklikt) {
            if (gevonden) {
                g.drawString("De waarde " + invoer + " is " + aantal + " keer gevonden.", 20, 50);
            }
            else {
                g.drawString("De waarde is niet gevonden.", 20, 50);
            }
        }
    }

    class ButtonListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            knopGeklikt = true;
            invoer = 0;

            String s1 = tekstvak.getText();
            invoer = Integer.parseInt(s1);

            gevonden = false;
            aantal = 0;
            int teller = 0;
            while (teller < waarde.length) {
                if (waarde[teller] == invoer) {
                    gevonden = true;
                    aantal++;
                }
                teller++;
            }
            repaint();
        }
    }
}

