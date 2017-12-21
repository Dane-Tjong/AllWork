package HS11;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Praktijkopdracht2_Hs11 extends Applet {
    TextField tekstvak;
    Button okeknop;
    int getal, getal2;

    public void init() {
        okeknop = new Button();
        okeknop.setLabel("Oke");
        okeknopListener kn1 = new okeknopListener();
        okeknop.addActionListener(kn1);
        add(okeknop);
    }

    public void paint(Graphics g) {
        int teller;
        int getal1 = 0;
        int y = 10;

        for (teller = 0; teller < 11; teller++) {
            y += 20;
            g.drawString(getal1 + " x " + getal2 + " = " + (getal1 * getal2), 20, y);
            getal1 = getal1 + 1;
        }
    }

    class okeknopListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            getal2 += 1;
            repaint();

            if (getal2 >= 11) {
                getal2 = 0;
                repaint();
            } else {
                repaint();
            }
        }
    }
}


