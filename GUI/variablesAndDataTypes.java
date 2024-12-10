import javax.swing.*;
import java.awt.*;

public class variablesAndDataTypes{
    public static void main(String[] args){
        String courseName = "Informatics/Computer Science 8th Grade";
        String studentName = "Kaloyan";
        char letterGrade = 'A';


        JFrame window = new JFrame();
        JLabel output = new JLabel(studentName + " got " + letterGrade + " from the " + courseName + " course.");

        window.add(output);
        window.setSize(500,500);
        window.setVisible(true);

    }
}
