import javax.swing.JFrame;
import java.util.*;
import java.awt.event.*;

public class BoxGame {
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setSize(1500,700);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       
        BoxComponent component = new BoxComponent();
        component.addKeyListener(new KeyListener(){  
        public void keyPressed(KeyEvent e) { component.moveLeft(); }

        public void keyReleased(KeyEvent e) { System.out.println("2test2"); }

        public void keyTyped(KeyEvent e) { System.out.println("3test3"); }
    });
        frame.add(component);
        frame.setVisible(true);
    }

   public void keyPressed(KeyEvent e) {
    switch (e.getKeyCode()) {
        case KeyEvent.VK_LEFT:
            this.moveLeft();
            break;
        case KeyEvent.VK_RIGHT:
            this.moveRight();
            break;
    }
  }
}
