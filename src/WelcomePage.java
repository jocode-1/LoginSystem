import javax.swing.*;
import java.awt.*;

public class WelcomePage {
    JFrame frame = new JFrame();
    JLabel welcomeLabel = new JLabel("Welcome to Homepage");

    WelcomePage(String userId) {

        welcomeLabel.setBounds(0,0,200,35);
        welcomeLabel.setFont(new Font(null,Font.PLAIN,20));
        welcomeLabel.setText("Hello "+ userId );


        frame.add(welcomeLabel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(420,420);
        frame.setResizable(false);
        frame.setLayout(null);
        frame.setVisible(true);
    }
}
