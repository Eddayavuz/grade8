import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ticket extends JFrame {
    private JComboBox comboBox1;
    private JButton purchaseButton;
    private JTextField textField1;
    private JPanel panel;
    private JLabel print;

    public ticket() {

        setContentPane(panel);
        setSize(600,500);
        setVisible(true);

        purchaseButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int choice = comboBox1.getSelectedIndex();
                double money = Double.parseDouble(textField1.getText());
                double change = 0;
                switch (choice) {
                    case 0:
                        change = money - 2;
                        break;
                    case 1:
                        change = money - 5;
                        break;
                    case 2:
                        change = money - 10;
                        break;
                    case 3:
                        change = money - 8;
                        break;
                    default:
                        print.setText("invlaid input!");
                }
                if(change>0){
                    print.setText("here is your change: "+ change);}
                else if (change == 0){
                    print.setText("no change");
                }else{
                    print.setText("you are broke!");
                }
            }
        });
    }
}
