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
