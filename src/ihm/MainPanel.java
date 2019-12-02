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

		//window = new JFrame();
		
		menu = new HeadMenu();
		labyrinthePanel = new Window("",maze);
		rightPanel = new RightPanel();
		setLayout(new BorderLayout());
		add(labyrinthePanel,BorderLayout.SOUTH);
		add(menu,BorderLayout.NORTH);
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		//pack();
		setVisible(true);
		
		
		
	}

}