
import java.awt.Color;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class Login implements ActionListener {
    JFrame f;
    JLabel l1, l2;
    JTextField t1, t2;
    Container c;
    JButton b;

    Login() {
        f = new JFrame("Login Page");
        c = f.getContentPane();
        f.setLayout(null);
        c.setBackground(Color.PINK);
        l1 = new JLabel("User Name:");
        l1.setBounds(250, 250, 100, 30);
        t1 = new JTextField();
        t1.setBounds(380, 250, 150, 30);
        l2 = new JLabel("Enter Password");
        l2.setBounds(250, 300, 100, 30);
        t2 = new JTextField();
        t2.setBounds(380, 300, 150, 30);
        b = new JButton(" LOGIN ");
        b.setBounds(350, 400, 100, 40);
        c.add(l1);
        c.add(t1);
        c.add(l2);
        c.add(t2);
        c.add(b);
        b.addActionListener(this);
        f.setVisible(true);
        f.setLayout(null);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }

    public void actionPerformed(ActionEvent e) {
        String a = "khushi";
        String b = "1234";
        // String c = t1.getText();
        // String d = t2.getText();
        if (e.getSource() == b) {
            if (a == t1.getText() & b == t2.getText()) {
                new ValidUser();
            } else {
                new WrongUser();
            }
        }

    }

    public static void main(String[] args) {
        new Login();
    }
}