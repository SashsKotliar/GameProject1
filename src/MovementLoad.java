import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class MovementLoad implements KeyListener {

    private KeyPressDetector spaceDetector;

    public MovementLoad(KeyPressDetector spaceDetector) {
        this.spaceDetector = spaceDetector;
    }

    public void keyTyped(KeyEvent e) {

    }

    public void keyPressed(KeyEvent e) {
        switch (e.getKeyCode()) {
            case KeyEvent.VK_SPACE:
                this.spaceDetector.setSpacePressed(true);
                break;
        }
    }

    public void keyReleased(KeyEvent e) {

    }
}
