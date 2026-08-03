import java.awt.Color;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class Calculator_Container_Window implements ActionListener {
    JFrame f;
    JLabel l1, l2, l3;
    JTextField t1, t2, t3;
    JButton b1, b2, b3, b4;
    Container c;
    ButtonGroup bg;

    Calculator_Container_Window() {
        f = new JFrame();
        c = f.getContentPane();
        f.setLayout(null);
        c.setBackground(Color.WHITE);
        // c.setBackground(Color.PINK);

        l1 = new JLabel("Enter First Number :");
        l1.setBounds(100, 120, 200, 30);
        t1 = new JTextField();
        t1.setBounds(250, 120, 150, 20);

        l2 = new JLabel("Enter Second Number :");
        l2.setBounds(100, 150, 200, 30);
        t2 = new JTextField();
        t2.setBounds(250, 150, 150, 20);
        l3 = new JLabel("Result is :");
        l3.setBounds(100, 300, 200, 30);
        t3 = new JTextField();
        t3.setBounds(250, 300, 150, 20);
        bg = new ButtonGroup();
        b1 = new JButton(" + ");
        b2 = new JButton(" - ");
        b3 = new JButton(" / ");
        b4 = new JButton(" * ");
        b1.setBounds(100, 200, 50, 30);
        b2.setBounds(180, 200, 50, 30);
        b3.setBounds(260, 200, 50, 30);
        b4.setBounds(340, 200, 50, 30);
        bg.add(b1);
        bg.add(b2);
        bg.add(b3);
        bg.add(b4);
        c.add(l1);
        c.add(l2);
        c.add(b1);
        c.add(b2);
        c.add(b3);
        c.add(b4);
        c.add(t1);
        c.add(t2);
        c.add(l3);
        c.add(t3);
        b1.addActionListener(this);
        b2.addActionListener(this);
        b3.addActionListener(this);
        b4.addActionListener(this);

        // add(b1);
        // add(b2);
        // add(b3);
        // add(b4);
        // b1.addActionListener(new Outer());
        // b2.addActionListener(new Outer());
        // b3.addActionListener(new Outer());
        // b4.addActionListener(new Outer());
        // t3.addActionListener(new Outer());
        // f.setSize(800, 550);
        f.setTitle("CALCULATOR");
        f.setVisible(true);
        f.setLayout(null);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }

    public static void main(String[] args) {

        new Calculator_Container_Window();
    }

    public void actionPerformed(ActionEvent e) {
        int c = 0;
        int a = Integer.parseInt(t1.getText());
        int b = Integer.parseInt(t2.getText());
        if (e.getSource() == b1) {
            c = a + b;
        } else if (e.getSource() == b2) {
            c = a - b;
        } else if (e.getSource() == b3) {
            c = a / b;
        } else {
            c = a * b;
        }
        t3.setText(" " + c);
    }
}