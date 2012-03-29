import java.awt.BorderLayout;
import java.awt.CardLayout;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.SwingUtilities;
import javax.swing.border.LineBorder;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class MainWindow extends JFrame {
	
	private CardPanel cardpanel;
	private CardLayout cl;
	private JPanel buttonPanel;
	
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
		
		getContentPane().setLayout(new BorderLayout());
		cardpanel = new CardPanel();
		cardpanel.setMainWindow(this);
		
		getContentPane().add(cardpanel, BorderLayout.CENTER);
		getContentPane().add(createButtonPanel(), BorderLayout.WEST);
	}
	
	private JPanel createButtonPanel() {
		buttonPanel = new JPanel();
		buttonPanel.setBorder(LineBorder.createGrayLineBorder());
		buttonPanel.setLayout(new BoxLayout(buttonPanel, BoxLayout.Y_AXIS));
		
		JButton viewMainPanel = new JButton("Main panel");
		viewMainPanel.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				cardpanel.swapPanel("Main panel");
			}
		});
		
		JButton viewSearchPanel = new JButton("Search");
		viewSearchPanel.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				cardpanel.swapPanel("Search panel");
			}
		});
		
		JButton viewHistoryPanel = new JButton("History");
		viewHistoryPanel.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				cardpanel.swapPanel("History panel");
			}
		});
		
		buttonPanel.add(viewMainPanel);
		buttonPanel.add(viewHistoryPanel);
		buttonPanel.add(viewSearchPanel);
		buttonPanel.setVisible(false);
		return buttonPanel;
	}
	
    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                MainWindow mw = new MainWindow();
                mw.setVisible(true);
            }
        });
    }
    
    public CardLayout getCl(){
    	return cl;
    }

	public void setButtonPanelVisible() {
		buttonPanel.setVisible(true);
		
	}
}
