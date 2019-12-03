package ihm;

import javax.swing.*;

import java.awt.*;

import maze.*;

public class MainPanel extends JPanel{
	
	private Maze maze;
	private HeadMenu menu;
	private JPanel labyrinthePanel;
	private RightPanel rightPanel;
	private Window window;
	private int labyrinthePanelInsideSize;
	
	public MainPanel(Maze maze) {
		super();
		this.maze = maze;
		//setSize(1000, 1000);

		
		menu = new HeadMenu();
		labyrinthePanel = new JPanel();
		labyrinthePanel.setPreferredSize(new Dimension(labyrinthePanelInsideSize,labyrinthePanelInsideSize));
		rightPanel = new RightPanel();
		
		//Les deux paragraphes qui suivent ont pour but de centrer un MazePanel rectagualaire dans le labyrinthePanel carré
		//Je cree un BorderLayout, dans lequel je met au centre le MazePanel à la bonne dimension
		//Je complete le BorderLayout avec highPanel et lowPanel qui completent le vide
		labyrinthePanel.setLayout(new BorderLayout());
		JPanel labyrinthePanelInside = new ResolvedMazePanel(maze);
		labyrinthePanelInsideSize = 600;
		int length = maze.getLongeur();
		int width = maze.getLargeur();
		int cote = Math.min(labyrinthePanelInsideSize/length,labyrinthePanelInsideSize/width);
		labyrinthePanelInside.setPreferredSize(new Dimension(width*cote,length*cote));
		
		if (width>=length) {
			JPanel highPanel = new JPanel();
			JPanel lowPanel = new JPanel();
			int sideHeight = (labyrinthePanelInsideSize - Math.min(length,width)*cote)/2;
			highPanel.setPreferredSize(new Dimension(labyrinthePanelInsideSize, sideHeight));
			lowPanel.setPreferredSize(new Dimension(labyrinthePanelInsideSize, sideHeight));
			labyrinthePanel.add(labyrinthePanelInside, BorderLayout.CENTER);
			labyrinthePanel.add(highPanel, BorderLayout.NORTH);
			labyrinthePanel.add(lowPanel, BorderLayout.SOUTH);
		}
		else {
			JPanel leftPanel = new JPanel();
			JPanel rightPanel = new JPanel();
			int sideHeight = (labyrinthePanelInsideSize - Math.min(length,width)*cote)/2;
			leftPanel.setPreferredSize(new Dimension(sideHeight, labyrinthePanelInsideSize));
			rightPanel.setPreferredSize(new Dimension(sideHeight, labyrinthePanelInsideSize));
			labyrinthePanel.add(labyrinthePanelInside, BorderLayout.CENTER);
			labyrinthePanel.add(leftPanel, BorderLayout.WEST);
			labyrinthePanel.add(rightPanel, BorderLayout.EAST);
		}
		
		
		
		BorderLayout bLayout = new BorderLayout();
		setLayout(bLayout);
		bLayout.setHgap(3);
		bLayout.setVgap(3);
		add(labyrinthePanel,BorderLayout.CENTER);
		add(menu,BorderLayout.NORTH);
		add(rightPanel,BorderLayout.EAST);
		setBackground(Color.BLACK);
		//setContentPanel(labyrinthePanel);
		
		//setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		//pack();
		setVisible(true);
		
		
		
	}

}