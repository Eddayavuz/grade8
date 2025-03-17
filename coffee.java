import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class coffee extends JFrame{
    private JPanel panel;
    private JComboBox comboBox1;
    private JButton purchaseButton;
    private JLabel print;
    private JTextField textField1;
    private JLabel printChange;
    private JComboBox comboBox2;
    private JCheckBox milkCheckBox;
    private JCheckBox sugarCheckBox;

    public coffee() {

        setContentPane(panel);
        setSize(500,400);
        setVisible(true);

        purchaseButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                int choice = comboBox1.getSelectedIndex();
                double price = 0;

                switch (choice){
                    case 1:
                        price = price + 2;
                        break;
                    case 2:
                        price = price + 5;
                        break;
                    case 3:
                        price = price + 4;
                        break;
                    default:
                        print.setText("invalid choice");
                        break;
                }

               choice = comboBox2.getSelectedIndex();

                switch (choice){
                    case 1:
                        break;
                    case 2:
                        price = price + 1;
                        break;
                    case 3:
                        price = price + 2;
                        break;
                    default:
                        print.setText("invalid choice");
                        break;
                }
                if(milkCheckBox.isSelected()){
                    price = price + 0.5;
                }

                if(sugarCheckBox.isSelected()){
                    price = price + 0.25;
                }

                print.setText(String.valueOf(price));

            }
        });
    }
}
