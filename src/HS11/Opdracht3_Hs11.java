package HS11;

import java.awt.*;
import java.applet.Applet;

public class Opdracht3_Hs11 extends Applet{


        public void init() {
        }

        public void paint(Graphics g) {
            int teller;
            int getal1 = 0;
            int getal2 = 1;
            int x = 0;

                                /*12 wegens colission*/
            for(teller = 0; teller < 12; teller++) {
                x += 30;
                g.drawString("" + (getal1+getal2), x, 20 );
                getal1 = getal2;
                getal2 = getal1 + getal2;
            }
        }
    }

