import java.awt.BorderLayout;
import java.awt.print.Pageable;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.LineBorder;


public class MainPanel extends JPanel{

	private CardPanel cp;
	
	public MainPanel(){
		JLabel placeholder = new JLabel("main panel here");
		add(placeholder);
	}
	

	public void setCP(CardPanel cp){
		this.cp = cp;
	}
}
