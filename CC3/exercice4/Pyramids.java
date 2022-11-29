package exercice4;

import java.awt.*;

public class Pyramids {
    public static final int SIZE = 100;

    public static void main(String[] args) {

        DrawingPanel panel = new DrawingPanel(350, 250);
        Graphics g = panel.getGraphics();

        drawPyramid(g, Color.WHITE, 0, 0, 10);
        drawPyramid(g, Color.RED, 80, 140, 5);
        drawPyramid(g, Color.BLUE, 220, 50, 20);

    }
}
