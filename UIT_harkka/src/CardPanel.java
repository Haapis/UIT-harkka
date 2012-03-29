import java.awt.BorderLayout;
import java.awt.CardLayout;

import javax.swing.JPanel;


public class CardPanel extends JPanel{
	
	private MainWindow mw;
	private static final String LOGINPANEL = "Login panel"; // The first panel shown to user
	private static final String MAINPANEL = "Main panel"; // The panel where the user sees reservations etc
	private static final String SEARCHPANEL = "Search panel"; // The panel where you can search stuff
	private static final String HISTORYPANEL = "History panel"; // The panel where you can search stuff
	
	private CardLayout cardlayout = new CardLayout();
	private JPanel cards = new JPanel(cardlayout);

	
	public CardPanel(){
		
		LoginPanel lp = new LoginPanel();
		MainPanel mp = new MainPanel();
		SearchPanel sp = new SearchPanel();
		HistoryPanel hp = new HistoryPanel();
		
		lp.setCP(this);
		mp.setCP(this);
		sp.setCP(this);
		hp.setCP(this);
		
		cards.add(lp, LOGINPANEL);
		cards.add(mp, MAINPANEL);
		cards.add(sp, SEARCHPANEL);
		cards.add(hp, HISTORYPANEL);
		setLayout(new BorderLayout());
		
		add(cards, BorderLayout.CENTER);

	}
	
	public void setMainWindow(MainWindow mw){
		this.mw = mw;
	}
	
	public MainWindow getMainWindow(){
		return mw;
	}
	
	// Use this to decide what panel to show
	public void swapPanel(String panel) {
	      cardlayout.show(cards, panel);
	}

}
