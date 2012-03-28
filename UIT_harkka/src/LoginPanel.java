import java.awt.BorderLayout;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;


public class LoginPanel extends JPanel {
	
	public LoginPanel(){
		setLayout(null);
		
		JLabel userName = new JLabel("Username");
		userName.setBounds(300, 200, 100, 20);
		
		JTextField userNameField = new JTextField();
		userNameField.setBounds(300, 220, 100, 20);
		
		JLabel passWord = new JLabel("Password");
		passWord.setBounds(420, 200, 100, 20);
		
		JPasswordField passWordField = new JPasswordField();
		passWordField.setBounds(420, 220, 100, 20);
		
		JButton loginButton = new JButton("Login");
		loginButton.setBounds(550, 200, 100, 50);
		
		add(userName);
		add(passWord);
		add(userNameField);
		add(passWordField);
		add(loginButton);
		
	}

}
