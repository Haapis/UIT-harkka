import java.awt.BorderLayout;
import java.awt.Dimension;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.LineBorder;


public class SearchPanel extends JPanel{

	private CardPanel cp;
	
	public SearchPanel(){
		JLabel placeholder = new JLabel("search panel here");
		add(placeholder);
		
		setLayout(new BorderLayout());
		
		add(createSearchPanel(), BorderLayout.WEST);
		
	}
	
	private JPanel createSearchPanel(){
		JPanel leftPanel = new JPanel();
		
		leftPanel.setLayout(new BoxLayout(leftPanel, BoxLayout.PAGE_AXIS));
		
		JLabel searchByStatus = new JLabel("Search by status");
		leftPanel.add(searchByStatus);
		
		/* Add the choices to combobox here */
		String[] searchChoices = {"Completed", "On-going", "Returned", "Checked"};
		JComboBox searchParams = new JComboBox(searchChoices);
		searchParams.setMaximumSize(new Dimension(1000, 40));
		leftPanel.add(searchParams);
		
		JLabel searchByUser = new JLabel("Search by user");
		JTextField searchByUserField = new JTextField();
		
		/* Stop the box from going huge because of boxlayout */
		searchByUserField.setMaximumSize(new Dimension(1000, 20));
		
		JButton search = new JButton("Search");
		leftPanel.add(searchByUser);
		leftPanel.add(searchByUserField);
		leftPanel.add(search);
		
		leftPanel.setBorder(LineBorder.createGrayLineBorder());
		
		return leftPanel;
	}
	
	public void setCP(CardPanel cp){
		this.cp = cp;
	}
}
