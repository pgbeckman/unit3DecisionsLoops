import java.awt.*;
import javax.swing.JComponent;
import java.awt.geom.*;

public class BoxComponent extends JComponent {
    public static int boxPos;
    public static int boxVel;
    public BoxComponent() {
        ThreadTest a = new ThreadTest();
        a.start();
    }
    public void paintComponent(Graphics g) {
    Graphics2D g2 = (Graphics2D) g;
    Rectangle2D.Double box = new Rectangle2D.Double(250+boxPos,400,50,50);
    g2.fill(box);
  }
  public static void moveRight() {
      boxVel+=10;
  }
  public static void moveLeft() {
      boxVel-=10;
    }
    public class ThreadTest extends Thread {
    public void run(){
        while (true) {
                try{
                    sleep(100);
                    boxPos+=boxVel;
                    repaint();
            } catch (Exception e) {
            }
        }
    }
  }
}