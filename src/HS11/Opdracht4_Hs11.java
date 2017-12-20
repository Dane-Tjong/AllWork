package HS11;

import java.applet.Applet;
import java.awt.*;

public class Opdracht4_Hs11 extends Applet {

    public void init() {
    }

    public void paint(Graphics g) {
        int teller;
        int getal1 = 0;
        int getal2 = 3;
        int x = 0;

        for (teller = 0; teller < 12; teller++) {
            x += 30;
            g.drawString("" + (getal1*getal2), x, 20);
            getal1 = getal1+1;
        }
    }
}
