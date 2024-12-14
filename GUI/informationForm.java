import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class informationForm extends JFrame {

    private JTextField firstName;
    private JTextField lastName;
    private JTextField age;
    private JButton enterButton;
    private JLabel label1;
    private JLabel label2;
    private JLabel label3;
    private JPanel mainPanel;

    public informationForm() {
        setContentPane(mainPanel);

        enterButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(null, "welcome to our website " + firstName.getText() + lastName.getText() + "you are " + age.getText() + " years old." );
            }
        });
        setSize(500,500);
        setVisible(true);
    }

    public static void main(String[] args) {
        new informationForm();
    }
}
