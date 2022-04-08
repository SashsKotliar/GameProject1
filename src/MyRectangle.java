import java.awt.*;

public class MyRectangle extends ShapeDefined{

    public MyRectangle(int x, int y, int w, int h, Color color){
        super(x, y, w, h, color);
    }
    public void paint(Graphics graphics) {
        graphics.setColor(super.getColor());
        graphics.fillRect(super.getX(), super.getY(), super.getW(), super.getH());
    }
}
