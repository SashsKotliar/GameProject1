import java.awt.*;


public class Bullet  {
    public static final int X=423;
    public static final int Y=600;
    public static final int WIDTH=5;
    public static final int HEIGHT=15;
    public static final int LOAD = 4;

    private MyRectangle body;
    private HalfC bulletHead;
    private int direction3;

    public Bullet(){
        this.body=new MyRectangle(X,Y,WIDTH,HEIGHT, Color.blue);
        this.bulletHead=new HalfC(X,Y-7,WIDTH,HEIGHT,360,180,Color.CYAN);
    }


    public Bullet(int x,int y) {
        this.body = new MyRectangle(x, y,WIDTH,HEIGHT ,Color.blue);
        this.bulletHead = new HalfC(x, y,WIDTH,HEIGHT, 360, 180, Color.CYAN);
    }
    public void paint(Graphics graphics){
        this.body.paint(graphics);
        this.bulletHead.paint(graphics);

    }
    public void moveRight(){
        this.body.moveRight();
        this.bulletHead.moveRight();
    }
    public void moveLeft(){
        this.body.moveLeft();
        this.bulletHead.moveLeft();
    }
    public void moveUp() {
        this.body.moveUp();
        this.bulletHead.moveUp();
    }
    public int getDirection3() {
        return direction3;
    }

    public void setDirection3(int direction3) {
        this.direction3 = direction3;
    }

    public MyRectangle getBody() {
        return body;
    }
}
