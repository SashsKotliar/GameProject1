import java.awt.*;

public class Circle extends ShapeDefined{

    public Circle(int x, int y, int width, int height, Color color) {
       super(x, y, width, height, color);
    }
    public void paint(Graphics graphics) {
        graphics.setColor(super.getColor());
        graphics.fillOval(super.getX(), super.getY(), super.getW(), super.getH());
    }
}
