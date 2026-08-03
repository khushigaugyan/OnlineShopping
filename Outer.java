import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Outer extends Calculator_Container_Window implements ActionListener {

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
