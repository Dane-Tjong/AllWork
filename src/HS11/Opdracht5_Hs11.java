package HS11;

import java.applet.Applet;
import java.awt.*;

public class Opdracht5_Hs11 extends Applet {

    public void init() {
    }

    public void paint(Graphics g) {
        int teller;
        int getal1 = 15;
        int getal2 = 15;
        int x = 10;
        int y = 10;

        for (teller = 0; teller < 5; teller++) {
            x += 25;
            y += 25;
            g.drawRect(x,y,25,25);
        }
    }
}
