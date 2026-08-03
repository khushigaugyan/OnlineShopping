import java.awt.Color;
import java.awt.Container;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class Calculator {
    JFrame f;
    JLabel l1, l2, l3;
    JButton b1, b2, b3, b4;
    JTextField t1, t2, t3;
    Container c;

    Calculator() {
        // System.setProperty("java.awt.headless", "false");
        // System.setProperty("DISPLAY", "localhost:0.0");

        f = new JFrame("Calculator");
        c = f.getContentPane();
        f.setLayout(null);
        c.setBackground(Color.PINK);
        l1 = new JLabel("Enter first Number");
        l1.setBounds(100, 180, 120, 30);

        t1 = new JTextField();
        t1.setBounds(230, 180, 120, 30);
        c.add(l1);
        c.add(t1);
        // f.setSize(800, 550);
        f.setVisible(true);
        f.setLayout(null);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        new Calculator();
    }
}