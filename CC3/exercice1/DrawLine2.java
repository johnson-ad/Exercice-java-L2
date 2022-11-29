package exercice1;

import java.awt.*;

public class DrawLine2 {
    public static void main(String[] args) {
        DrawingPanel panel = new DrawingPanel(200, 100);
        Graphics g = panel.getGraphics();
        Graphics cla1 = panel.getGraphics();
        Graphics cla2 = panel.getGraphics();

        g.drawLine(25, 75, 175, 25);
        cla1.drawLine(175, 25, 200, 80);
        cla2.drawLine(200, 80, 25, 75);
    }
}
