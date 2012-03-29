import javax.swing.JLabel;
import javax.swing.JPanel;


public class HistoryPanel extends JPanel {
	private CardPanel cp;
	
	public HistoryPanel(){
		JLabel placeholder = new JLabel("history panel here");
		add(placeholder);
	}
	
	public void setCP(CardPanel cp){
		this.cp = cp;
	}
}
