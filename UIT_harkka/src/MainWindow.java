import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.SwingUtilities;

public class MainWindow extends JFrame {
	
	public MainWindow(){
		createGUI();
	}
	
	private void createGUI(){
		
		//Construct the JFrame
		setTitle("UIT harkka");
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setSize(800, 640);
		setResizable(false);
		
		LoginPanel lp = new LoginPanel();
		getContentPane().add(lp);
		
		/*
		JPanel panel = new JPanel();
		getContentPane().add(panel);
		
		JLabel userName = new JLabel("Username");
		JTextField userNameField = new JTextField();
		
		JLabel passWord = new JLabel("Password");
		JPasswordField passWordField = new JPasswordField();
		
		panel.add(userName);
		panel.add(passWord);
		panel.add(userNameField);
		panel.add(passWordField);
		*/
		
	}
	
    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                MainWindow mw = new MainWindow();
                mw.setVisible(true);
            }
        });
    }
}
