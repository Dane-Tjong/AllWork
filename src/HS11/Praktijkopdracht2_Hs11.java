package HS11;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Praktijkopdracht2_Hs11 extends Applet {
    Button okeknop, terugknop;
    TextField tekstvak;
    int getal, getal1, getal2;


    public void init() {
        tekstvak = new TextField("", 20);
        tekstvak.addActionListener (new TekstvakListener());
        add(tekstvak);

        okeknop = new Button();
        okeknop.setLabel("Oke");
        okeknopListener kn1 = new okeknopListener();
        okeknop.addActionListener(kn1);
        add(okeknop);

        terugknop = new Button();
        terugknop.setLabel("terug");
        terugknopListener kn2 = new terugknopListener();
        terugknop.addActionListener(kn2);
        add(terugknop);
    }


    public void paint(Graphics g) {

            int teller;
            getal1 = 0;
            int x = 0;
        g.drawString("dit is de tafel van :" + getal, 50, 60);

        for (teller = 0; teller < 11; teller++) {
                x += 30;
                g.drawString("" + (getal1 * getal2), x, 80);
                getal1 = getal1 + 1;

            switch (getal) {
                case 0:
                    getal2 = 0;
                    break;
                case 1:
                    getal2 = 1;
                    break;
                case 2:
                    getal2 = 2;
                    break;
                case 3:
                    getal2 = 3;
                    break;
                case 4:
                    getal2 = 4;
                    break;
                case 5:
                    getal2 = 5;
                    break;
                case 6:
                    getal2 = 6;
                    break;
                case 7:
                    getal2 = 7;
                    break;
                case 8:
                    getal2 = 8;
                    break;
                case 9:
                    getal2 = 9;
                    break;
                case 10:
                    getal2 = 10;
                    break;
                default:
                    getal2 = 0;
                    break;
            }
        }
    }
    class TekstvakListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            String s = tekstvak.getText();
            getal = Integer.parseInt(s);
            getal2 = getal;
            repaint();
        }
    }
    class okeknopListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            getal = getal + 1;
            repaint();
        }
    }
    class terugknopListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            getal = getal - 1;
            repaint();
        }
    }
}






