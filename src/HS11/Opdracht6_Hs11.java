package HS11;

import java.applet.Applet;
import java.awt.*;

public class Opdracht6_Hs11 extends Applet {

    public void init() {
    }

    public void paint(Graphics g) {
        int teller;
        int xg = 20;
        int yg = 20;
        int xl = 30;
        int yl = 30;

        for (teller = 0; teller < 5; teller++) {
            xg += 10;
            yg += 10;
            xl -= 5;
            yl -= 5;
            g.drawOval(xl,yl,xg,yg);
        }
    }
}
