package HS12;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Praktijkopdracht_HS12 extends Applet{
    TextField naamTextField;
    TextField telefoonTextField;
    Button button;
    String[] namen;
    String[] nummers;
    int aantalGeklikt;

    private final static int AANTAL_INVOER = 10;

    public void init() {
        naamTextField = new TextField(10);
        add(naamTextField);
        telefoonTextField = new TextField(10);
        add(telefoonTextField);

        button = new Button("ok");
        add(button);
        namen = new String[AANTAL_INVOER];
        nummers = new String[AANTAL_INVOER];
        aantalGeklikt = 0;

        button.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent e) {
                namen[aantalGeklikt] = naamTextField.getText();
                nummers[aantalGeklikt] = telefoonTextField.getText();
                aantalGeklikt++;
                if (aantalGeklikt == AANTAL_INVOER) {
                    repaint();
                }
            }
        });
    }

    public void paint(Graphics g) {
        if (aantalGeklikt != 0) {
            int x1 = 50;
            int x2 = 150;
            int y = 70;

            for (int i = 0; i < AANTAL_INVOER; i++) {
                g.drawString(namen[i], x1, y);
                g.drawString(nummers[i], x2, y);
                y += 20;
            }
            aantalGeklikt = 0;
        }
    }
}

