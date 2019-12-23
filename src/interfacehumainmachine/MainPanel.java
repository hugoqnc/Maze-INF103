package interfacehumainmachine;


import java.awt.*;
import javax.swing.JPanel;

public class MainPanel extends JPanel{
	
	public HeadMenu headMenu;
	public SecondPanel secondPanel;
	
	public MainPanel() {
		headMenu = new HeadMenu();
		secondPanel = new SecondPanel();		
		
	}

}
