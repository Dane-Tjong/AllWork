package HS12;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Opdracht5_Hs12 extends Applet{
    TextField tekstvak;
    Button buttonOke;
    int index = 0;
    boolean knopGeklikt;
    boolean gevonden;
    double[] salaris = {100.0, 200.0, 500.0, 400.0, 300.0};
    double gezocht;

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
                g.drawString("De waarde is gevonden.", 20, 50);
            }
            else {
                g.drawString("De waarde is niet gevonden.", 20, 50);
            }

            g.drawString("Index Positie is: " + index, 20, 80);
            g.drawString("" + gezocht, 20, 110);
        }
    }

    class ButtonListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            knopGeklikt = true;
            gezocht = 0;

            String s1 = tekstvak.getText();
            gezocht = Double.parseDouble(s1);

            gevonden = false;
            int teller = 0;
            while (teller < salaris.length) {
                System.out.println("Index is: " + teller);
                if (salaris[teller] == gezocht) {
                    gevonden = true;
                    index = teller;
                    break;
                }
                teller++;
            }
            repaint();
        }
    }
}
