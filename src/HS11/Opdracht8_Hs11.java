package HS11;

import java.applet.Applet;
import java.awt.*;

public class Opdracht8_Hs11 extends Applet {

    public void init() {
    }

    public void paint(Graphics g) {
        int teller;
        int xg = 0;
        int yg = 0;
        int xl = 15;
        int yl = 15;

        for (teller = 0; teller <= 100; teller++) {
            xg += 10;
            yg += 10;
            xl -= 0;
            yl -= 0;
            g.drawOval(xl,yl,xg,yg);
        }
    }
}
