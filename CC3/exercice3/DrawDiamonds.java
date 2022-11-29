package exercice3;

import java.awt.*;
// import java.awt.Dimension;
// import java.awt.EventQueue;
// import java.awt.Graphics;
// import java.awt.Graphics2D;
// import java.awt.Shape;
// import java.awt.geom.AffineTransform;
// import java.awt.geom.Path2D;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

public class DrawDiamonds {

    public static void main(String[] args) {
        DrawingPanel panel = new DrawingPanel(360, 160);
        Graphics g = panel.getGraphics();
        drawManyDiamonds(g, 12, 15, 5, Color.BLUE);
        drawManyDiamonds(g, 55, 100, 5, Color.RED);

    }

}
