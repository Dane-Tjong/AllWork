import java.awt.*;
import java.applet.*;




public class Opdracht2_Hs6 extends Applet{

    int seconden, minuut, uur, dag, week, jaar;

    public void init () {

        seconden = 1;
        minuut = seconden*60;
        uur = minuut*60;
        dag = uur*24;
        week = dag*7;
        jaar = (week*52)+(dag/4);







    }


    public void paint (Graphics g) {

        g.drawString("totaal seconden in een jaar ="+jaar,60,60);




    }
}
