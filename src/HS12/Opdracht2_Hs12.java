package HS12;

import java.applet.Applet;
import java.awt.*;

public class Opdracht2_Hs12 extends Applet {
    Button[] knoppen = new Button[25];
    int teller;

    public void init() {
        for (Button button: knoppen){
            teller++;
            button = new Button();
            button.setLabel("knop"+teller);
            add(button);
        }
    }
}
