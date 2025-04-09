import javax.swing.*;
import java.awt.*;

public class frame extends JFrame {

    private JPanel panel;

    public frame() {

        MyPanel panel1 = new MyPanel();
        setSize(400, 400);
        setContentPane(panel1);
        setVisible(true);
    }
}
class MyPanel extends JPanel {
    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);

        // Set color
        g.setColor(Color.PINK);
        
        // Draw a line from (20, 20) to (100, 20)
        g.drawLine(20, 20, 100, 20);

        g.setColor(Color.BLUE);
        // Draw a rectangle at x=20, y=40, width=80, height=40
        g.fillRect(20, 20, 200, 40);

        g.setColor(Color.GREEN);
        // Draw an oval inside a bounding box at x=20, y=100, width=80, height=40
        g.fillOval(20, 100, 80, 40);
    }
}
