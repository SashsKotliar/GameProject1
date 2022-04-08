import java.awt.*;

public class HalfC extends ShapeDefined {
    private int statAngle;
    private int andAngle;

    public HalfC(int x, int y, int width, int height, int statAngle, int andAngle, Color color) {
        super(x, y, width, height, color);
        this.statAngle = statAngle;
        this.andAngle = andAngle;

    }
    public void paint(Graphics graphics) {
        graphics.setColor(super.getColor());
        graphics.fillArc(super.getX(), super.getY(), super.getW(), super.getH(), this.statAngle, this.andAngle);
    }
}
