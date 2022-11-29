public class Rectangle extends ShapeBasics implements RectangleInterface {

    private int height;
    private int width;

    public Rectangle() {
        super();
        height = 0;
        width = 0;
    }

    public Rectangle(int theOffset, int theHeight, int theWidth) {
        super();
        height = theHeight;
        width = theWidth;
    }

    public void set(int newHeight, int newWidth) {
        heigh = newHeight;
        width = newWidth;
    }

    public void drawHere() {
        drawHorizontaLline();
        drawSides();
        drawHorizontalLine();
    }
}
