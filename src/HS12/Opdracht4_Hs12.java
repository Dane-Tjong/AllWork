package HS12;

import java.awt.*;
import java.applet.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Opdracht4_Hs12 extends Applet {
    TextField tekstvak;
    Button buttonOke;

    private int index = 0;
    private boolean knopGeklikt;
    private boolean gevonden;
    private double[] salaris = {100.0, 200.0, 500.0, 400.0, 300.0};
    private double gezocht;

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
            g.drawString("Index Positie is: " + index, 20, 80);
            g.drawString("" + gezocht, 20, 110);
            if (gevonden) {
                g.drawString("De waarde is gevonden.", 20, 50);
            }
            else {
                g.drawString("De waarde is niet gevonden.", 20, 50);
            }
        }
    }

    class ButtonListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            knopGeklikt = true;
            gezocht = 0;

            String s1 = tekstvak.getText();
            gezocht = Double.parseDouble(s1);
            repaint();

            gevonden = false;
            int teller = 0;
            while (teller < salaris.length) {
                if (salaris[teller] == gezocht) {
                    gevonden = true;
                    index = teller;
                }
                teller++;
            }
            repaint();
        }
    }
}