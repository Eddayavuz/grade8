import javax.swing.*;

public class SimpleGUI {
    public static void main(String[] args) {
        // Create a new frame (window)
        JFrame frame = new JFrame("Simple GUI Design");
        frame.setSize(400, 300);

        // Create a label
        JLabel label = new JLabel("Welcome to My GUI!");
        label.setBounds(130, 50, 150, 20); // Set position and size of the label

        // Task 1: Create another label named "label2" with text "Type something below:" and place it below "label".

        // Create a buttona
        JButton button = new JButton("Click Me");
        button.setBounds(150, 150, 100, 30); // Set position and size of the button

        // Task 2: Create another button named "button2" with text "Exit" and place it below "button".

        // Task 3: Add a JTextField named "textField" and place it between "label2" and "button".
        //         Make the text field wide enough for the user to type some text.

        // Add components to the frame
        frame.add(label);
        frame.add(button);

        // Task 4: Add "label2", "button2", and "textField" to the frame.

        frame.setLayout(null); // Use null layout for absolute positioning
        frame.setVisible(true); // Make the frame visible
    }
}
