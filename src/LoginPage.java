import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.HashMap;

public class LoginPage implements ActionListener {

    JFrame frame = new JFrame("Login Frame");
    JButton loginButton = new JButton("Login");
    JButton resetButton = new JButton("Reset");
    JTextField userIdField = new JTextField();
    JPasswordField userPasswordField = new JPasswordField();
    JLabel userIdLabel = new JLabel("UserID: ");
    JLabel userPasswordLabel = new JLabel("Password: ");
    JLabel messageLabel = new JLabel( );


    HashMap<String,String> loginInfo = new HashMap<String,String>();

    LoginPage(HashMap<String,String> loginInfoOriginal){

        loginInfo = loginInfoOriginal;

        userIdLabel.setBounds(50,100,75,25);
        userPasswordLabel.setBounds(50,150,75,25);

        messageLabel.setBounds(125,250,250,35);
        messageLabel.setFont(new Font(null,Font.ITALIC,15));

        userIdField.setBounds(125,100,200,25);
        userPasswordField.setBounds(125,150,200,25);

        loginButton.setBounds(125,200,100,25);
        loginButton.setFocusable(false);
        loginButton.addActionListener(this);

        resetButton.setBounds(225,200,100,25);
        resetButton.setFocusable(false);
        resetButton.addActionListener(this);


        frame.add(loginButton);
        frame.add(resetButton);
        frame.add(userIdField);
        frame.add(userPasswordField);
        frame.add(messageLabel);
        frame.add(userIdLabel);
        frame.add(userPasswordLabel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(420,420);
        frame.setResizable(false);
        frame.setLayout(null);
        frame.setVisible(true);

    }

    @Override
    public void actionPerformed(ActionEvent e) {

        if (e.getSource() == resetButton) {
            userIdField.setText("");
            userPasswordField.setText("");
        }
        if (e.getSource() == loginButton) {
            String userId = userIdField.getText();
            String password = String.valueOf(userPasswordField.getPassword());

            if (loginInfo.containsKey(userId)){
                if (loginInfo.get(userId).equals(password)){
                    messageLabel.setForeground(Color.green);
                    messageLabel.setText("Logged in Successful");

                    frame.dispose();

                    WelcomePage welcomePage = new WelcomePage(userId);
                }
                else {
                    messageLabel.setForeground(Color.red);
                    messageLabel.setText("Wrong Password");
                }
            }
            else {
                messageLabel.setForeground(Color.red);
                messageLabel.setText("UserID Not Found");
            }
        }
    }
}

