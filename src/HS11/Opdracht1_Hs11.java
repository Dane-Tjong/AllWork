package HS11;
import java.awt.*;
import java.applet.Applet;

public class Opdracht1_Hs11 extends Applet{


    public void init() {}

    public void paint(Graphics g) {
        int teller;
        int x = 0;

        for(teller = 0; teller < 10; teller++) {
            x += 20;
            g.drawLine(x , 35, x, 300 );
            g.drawString("" + teller, x, 25 );
        }
    }
}