import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ageCheck extends JFrame {
    private JPanel panel;
    private JTextField textField1;
    private JButton ageCheckButton;
    private JLabel label;

    public ageCheck() {

        setVisible(true);
        setContentPane(panel);
        setSize(500,500);

        ageCheckButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int temp = Integer.parseInt(textField1.getText());
                if (temp<=14) {
                    label.setText("wear a jacket");
                }else if(temp>14 && temp <25){
                    label.setText("wear a tshirt");
                }else {
                    label.setText("wear shorts");
                }
            }
        });
    }
}
