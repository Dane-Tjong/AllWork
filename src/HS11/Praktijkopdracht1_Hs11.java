package HS11;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Praktijkopdracht1_Hs11 extends Applet {
    TextField tekstvak;
    int getal,getal2;
    public void init() {
        tekstvak = new TextField("", 20);
        tekstvak.addActionListener(new TekstvakListener());
        add(tekstvak);
    }

    public void paint(Graphics g) {
        int teller;
        int getal1 = 0;
        int x = 0;

        for (teller = 0; teller < 12; teller++) {
            x += 30;
            g.drawString("" + (getal1*getal2), x, 80);
            getal1 = getal1+1;
        }
    }


    class TekstvakListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            String s = tekstvak.getText();
            getal = Integer.parseInt( s );
            getal2 = getal;
            repaint();


        }
    }

}

