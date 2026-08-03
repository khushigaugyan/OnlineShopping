import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class ValidUser implements ActionListener {
    JFrame f;
    JLabel l;
    JButton b;
    Container c;

    ValidUser() {
        f = new JFrame();
        c = f.getContentPane();
        f.setLayout(null);
        l = new JLabel(" VALID USER ");
        l.setBounds(510, 200, 180, 80);
        b = new JButton(" Continue ");
        b.setBounds(500, 290, 120, 40);
        c.add(l);
        c.add(b);
        f.setVisible(true);
        f.setLayout(null);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == b) {
            new Start();
        }
    }

    public static void main(String[] args) {
        new ValidUser();
    }
}
