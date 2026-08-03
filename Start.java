
import java.awt.Container;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Start {
    JFrame f;
    JLabel l;
    JButton b;
    Container c;

    Start() {
        f = new JFrame();
        c = f.getContentPane();
        f.setLayout(null);
        l = new JLabel(" START YOUR SYSTEM ");
        l.setBounds(510, 200, 180, 80);
        b = new JButton(" START ");
        b.setBounds(500, 290, 120, 40);
        c.add(l);
        c.add(b);
        f.setVisible(true);
        f.setLayout(null);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
