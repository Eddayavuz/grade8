import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class calculator extends JFrame{   // REMEMBER TO ADD extends JFrame
    private JPanel panel;
    private JButton button2;
    private JTextField textField1;
    private JTextField textField2;
    private JButton button1;
    private JLabel label;

    public calculator() {

        // ALWAYS ADD THE FOLLOWING 3 LINES
        setContentPane(panel);
        setSize(500,500);
        setVisible(true);


        button2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                double number1 = Double.parseDouble(textField1.getText());
                double number2 = Double.parseDouble(textField2.getText());
                double result = number1 + number2;
                label.setText(String.valueOf(result));
                System.out.println(result);
            }
        });
        
        button1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                double number1 = Double.parseDouble(textField1.getText());
                double number2 = Double.parseDouble(textField2.getText());
                double result = number1 - number2;
                label.setText(String.valueOf(result));
                System.out.println(result);
            }
        });
    }
}
