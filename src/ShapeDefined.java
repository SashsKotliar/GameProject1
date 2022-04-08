import java.awt.*;
import java.util.ArrayList;

public abstract  class ShapeDefined {
    private int x;
    private int y;
    private int w;
    private int h;
    private Color color;


    public ShapeDefined(int x, int y, int w, int h,Color color){
        this.x=x;
        this.y=y;
        this.w=w;
        this.h=h;
        this.color=color;
    }

    public void moveRight(){
        this.x++;
    }
    public void moveLeft(){
        this.x--;
    }
    public void moveUp(){
        this.y--;
    }
    public void moveDown(){
        this.y++;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int getW() {
        return w;
    }

    public void setW(int w) {
        this.w = w;
    }

    public int getH() {
        return h;
    }

    public void setH(int h) {
        this.h = h;
    }

    public Color getColor() {
        return this.color;
    }

    public void setColor(Color color) {
        this.color = color;
    }
    public abstract void paint(Graphics graphics);
}
