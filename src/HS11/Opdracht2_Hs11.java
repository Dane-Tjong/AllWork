package HS11;
        import java.awt.*;
        import java.applet.Applet;

public class Opdracht2_Hs11 extends Applet{


    public void init() {}

    public void paint(Graphics g) {
        int teller;
        int x = 0;
        int num = 20;

        for(teller = 20; teller >= 10; teller--) {
            x += 20;

            g.drawString("" + teller, x, 25 );
        }
    }
}