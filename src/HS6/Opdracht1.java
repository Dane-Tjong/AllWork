import java.applet.Applet;
import java.awt.Color;
import java.awt.Graphics;



public class Opdracht1 extends Applet {
    int Winst;
    int Jan;
    int Ali;
    int Jeannette;
    int DJ;

    int WinstPP;


    public void init() {
        Winst = 113;
        Jan = 1;
        Ali = 1;
        Jeannette = 1;
        DJ = 1;

        WinstPP = Winst/(Jan+Ali+Jeannette+DJ);
    }

    public void paint(Graphics g) {

        g.drawString("113 / 4 =" + WinstPP,50,50);



    }
}
