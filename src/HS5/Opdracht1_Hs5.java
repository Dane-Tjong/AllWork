import java.applet.Applet;
import java.awt.Color;
import java.awt.Graphics;

class Opdracht1_Hs5 extends Applet {
    Color fill;
    Color draw;
    Color BG;


    public void init() {
        fill = Color.magenta;
        draw = Color.black;
        BG = Color.lightGray;
    }

    public void paint(Graphics g) {
        this.setBackground(BG);
        g.setColor(draw);
        g.drawLine(50, 20, 450, 20);
        g.drawString("Lijn", 255, 32);
        g.drawRect(50, 50, 400, 200);
        g.drawString("Rechthoek", 225, 261);
        g.drawRoundRect(50, 300, 400, 200, 90, 90);
        g.drawString("Afgeronde rechthoek", 200, 510);
        g.setColor(fill);
        g.fillRect(500, 50, 400, 200);
        g.setColor(draw);
        g.drawOval(500, 50, 400, 200);
        g.drawString("Gevulde rechthoek met ovaal", 620, 260);
        g.setColor(fill);
        g.fillOval(500, 300, 400, 200);
        g.setColor(draw);
        g.drawString("gevulde ovaal", 665, 512);
        g.setColor(fill);
        g.fillArc(950, 50, 400, 200, 0, 45);
        g.setColor(draw);
        g.drawArc(950, 50, 400, 200, 0, 360);
        g.drawString("taartpunt met ovaal eromheen", 1065, 262);
        g.drawOval(1050, 300, 200, 200);
        g.drawString("circle", 1140, 515);
    }
}
