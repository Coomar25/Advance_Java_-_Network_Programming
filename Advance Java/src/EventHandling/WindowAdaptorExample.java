package EventHandling;
import java.awt.*;
import java.awt.event.*;

/**
 * An example of using WindowAdapter to handle window events.
 */
public class WindowAdaptorExample {
    Frame f;
    
    public WindowAdaptorExample() {
        f = new Frame("Window Adaptor");
        f.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                f.dispose();
            }
        });
        
        f.setSize(300, 200);
        f.setLayout(null);
        f.setVisible(true);
    }
    
    public static void main(String[] args) {
        new WindowAdaptorExample();
    }
}
