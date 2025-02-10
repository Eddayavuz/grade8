import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class EvenOrOdd extends JFrame{
    private JTextField textField1;
    private JButton checkButton;
    private JPanel panel;
    private JLabel label;

    public EvenOrOdd() {
        setVisible(true);
        setSize(400,400);
        setContentPane(panel);
        checkButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int number = Integer.parseInt(textField1.getText()); // read the int from user and convert it to int
                // IMPLEMENT IF
                if(number%2 == 0){ label.setText("it's even!");
                }
                else
                { label.setText("it's odd!");
                }
            }
        });
    }
}
