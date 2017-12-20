package HS11;

import java.applet.Applet;
import java.awt.*;

public class Opdracht7_Hs11 extends Applet {

    public void init() {
    }

    public void paint(Graphics g) {
        int teller;
        int xg = 5;
        int yg = 5;
        int xl = 275;
        int yl = 275;

        for (teller = 0; teller <= 50; teller++) {
            xg += 10;
            yg += 10;
            xl -= 5;
            yl -= 5;
            g.drawOval(xl,yl,xg,yg);
        }
    }
}
