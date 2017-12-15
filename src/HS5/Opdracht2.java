import java.awt.*;
import java.applet.*;

public class Opdracht2 extends Applet {
    //kleuren
    Color achtergrondKleur;
    Color fill;
    Color draw;
    //personen
    Color Valerie;
    Color Jeroen;
    Color Hans;

    int Valeriex;
    int Jeroenx;
    int Hansx;




    public void init() {
        //kleuren
        achtergrondKleur = Color.lightGray;
        fill = Color.magenta;
        draw = Color.black;
        //personen
        Valerie = Color.red;
        Valeriex = 40;
        Jeroen = Color.BLUE;
        Jeroenx = 100;
        Hans = Color.yellow;
        Hansx = 80;
    }




    /*gewicht y as 20x 1*/

    public void paint(Graphics g) {

        setBackground(achtergrondKleur);

        /*graph box*/
        g.drawRect(50,50,450,300);



        /*metric line*/
            /*vertical*/
        g.drawLine(100,90,100,300);

            /*horizontal*/
        g.drawLine(100,300,400,300);
            /*weight lines*/
                                /*weight line*/
        g.drawString("gewicht in kilogram",55,70);

                /*100kg*/
        g.setColor(draw);
        g.drawLine(100,100,400,100);
        g.drawLine(100,100,80,100);
        g.drawString("100",55,105);
                /*80kg*/
        g.setColor(draw);
        g.drawLine(100,140,400,140);
        g.drawLine(100,140,80,140);
        g.drawString("80",55,145);
                /*60kg*/
        g.setColor(draw);
        g.drawLine(100,180,400,180);
        g.drawLine(100,180,80,180);
        g.drawString("60",55,185);
                /*40kg*/
        g.setColor(draw);
        g.drawLine(100,220,400,220);
        g.drawLine(100,220,80,220);
        g.drawString("40",55,225);
                /*20g*/
        g.setColor(draw);
        g.drawLine(100,260,400,260);
        g.drawLine(100,260,80,260);
        g.drawString("20",55,265);


        /*names*/

            /*Valerie (40kg)*/
        g.setColor(Valerie);
        g.drawString("Valerie",150,320);
            /*Jeroen (100kg)*/
        g.setColor(Jeroen);
        g.drawString("Jeroen",250,320);
            /*Hans (80kg)*/
        g.setColor(Hans);
        g.drawString("Hans",350,320);

        /*boxes*/
            /*Valerie*/
        g.setColor(Valerie);
        g.drawRect(150,300,25,0-Valeriex*2);
            /*Jeroen*/
        g.setColor(Jeroen);
        g.drawRect(250,300,25,0-Jeroenx*2);
            /*Hans*/
        g.setColor(Hans);
        g.drawRect(350,300,25,0-Hansx*2);




    }
}