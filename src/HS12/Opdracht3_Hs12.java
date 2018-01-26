package HS12;

import java.applet.Applet;
import java.awt.*;

public class Opdracht3_Hs12 extends Applet {
    TextField[] texten = new TextField[5];
    int teller;

    public void init() {
        for (TextField textField: texten){
            teller++;
            textField = new TextField("ayyy"+teller);
            add(textField);
        }
    }
}
