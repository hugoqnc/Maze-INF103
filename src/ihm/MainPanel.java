package ihm;

import javax.swing.*;

import java.awt.*;

import maze.*;

public class MainPanel extends JPanel{
	
	private Maze maze;
	private HeadMenu menu;
	private JPanel labyrinthePanel;
	private RightPanel rightPanel;
	private JFrame window;
	
	public MainPanel(Maze maze) {
		super();
		this.maze = maze;
		//setSize(1000, 1000);

		
		menu = new HeadMenu();
		labyrinthePanel = new ResolvedMazePanel(maze);
		rightPanel = new RightPanel();
		
		setLayout(new BorderLayout());
		add(labyrinthePanel,BorderLayout.CENTER);
		//add(menu,BorderLayout.NORTH);
		add(rightPanel,BorderLayout.EAST);
		//setContentPanel(labyrinthePanel);
		
		//setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		//pack();
		setVisible(true);
		
		
		
	}

}