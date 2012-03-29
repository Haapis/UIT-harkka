import java.awt.BorderLayout;
import java.awt.CardLayout;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;


public class LoginPanel extends JPanel {
	
	private CardPanel cp;
	
	public LoginPanel(){
		JLabel userName = new JLabel("Username");
		userName.setBounds(300, 200, 100, 20);
		
		JTextField userNameField = new JTextField();
		userNameField.setBounds(300, 220, 100, 20);
		
		JLabel passWord = new JLabel("Password");
		passWord.setBounds(420, 200, 100, 20);
		
		JPasswordField passWordField = new JPasswordField();
		passWordField.setBounds(420, 220, 100, 20);
		
		JButton loginButton = new JButton("Login");
		
		loginButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				cp.swapPanel("Main panel");
				cp.getMainWindow().setButtonPanelVisible();
			}
		});
				
		loginButton.setBounds(538, 190, 100, 50);
		setLayout(null);
		add(userName);
		add(userNameField);
		add(passWord);
		add(passWordField);
		add(loginButton);
		
	}
	
	public void setCP(CardPanel cp){
		this.cp = cp;
	}

}
