package ihm;

import javax.swing.*;

import java.awt.*;

import maze.*;

public class MainPanel extends JFrame{
	
	private Maze maze;
	private HeadMenu menu;
	private Window labyrinthePanel;
	private RightPanel rightPanel;
	
	public MainPanel(Maze maze) {
		super("Labyrinthe");
		this.maze = maze;
		setSize(1000, 1000);

		
		menu = new HeadMenu();
		labyrinthePanel = new Window("",maze);
		rightPanel = new RightPanel();
		setLayout(new BorderLayout());
		add(labyrinthePanel,BorderLayout.CENTER);
		add(menu,BorderLayout.NORTH);
		//setContentPanel(labyrinthePanel);
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		//pack();
		setVisible(true);
		
		
		
	}

}