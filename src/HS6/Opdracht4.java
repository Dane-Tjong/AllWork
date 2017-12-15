import java.awt.*;
import java.applet.*;

public class Opdracht4 extends Applet {



    double A;
    double B;
    double C;
    double D;
    double E;



    public void init() {
        A = 5.9;
        B = 6.3;
        C = 6.9;
        D = 3;

        E = (A+B+C)/D;
        E = E*10;
        E = (int) E;
        E = E/10;



    }


    public void paint (Graphics g) {

        g.drawString("Het Gemiddelde = "+E,60,60);

    }
}
