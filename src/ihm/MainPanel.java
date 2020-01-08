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
	private static int labyrinthePanelInsideSize = 600;//taille fixe du panel qui va contenir l'afficahge du labyrinthe
	
	public MainPanel(Window window) {
		super();
		this.window = window;
		this.maze = window.getMaze();

		menu = new HeadMenu(this.window);
		labyrinthePanel = new JPanel();
		labyrinthePanel.setPreferredSize(new Dimension(labyrinthePanelInsideSize,labyrinthePanelInsideSize));
		rightPanel = new RightPanel();
		int status = window.getMazeMode();
		
		
		labyrinthePanel.setLayout(new BorderLayout());
		JPanel labyrinthePanelInside = null;
		if (status == 1) {
			labyrinthePanelInside = new ResolvedMazePanel(window);
		}
		else if (status==2) {
			labyrinthePanelInside = new EditPanel(window);
		}
		else {
			labyrinthePanelInside = new MazePanel(window);
		}
		
		//Les deux paragraphes qui suivent ont pour but de centrer un MazePanel rectangulaire dans le labyrinthePanel carre
		//Je cree un BorderLayout, dans lequel je met au centre le MazePanel a la bonne dimension
		//Je complete le BorderLayout avec highPanel et lowPanel qui completent le vide
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
		
		
		//on rempli enfin le MainPanel avec son contenu
		BorderLayout bLayout = new BorderLayout();
		setLayout(bLayout);
		bLayout.setHgap(3);
		bLayout.setVgap(3);
		add(labyrinthePanel,BorderLayout.CENTER);
		add(menu,BorderLayout.NORTH);
		add(rightPanel,BorderLayout.EAST);
		setBackground(Color.BLACK);

		setVisible(true);
		
	}

	public void setResolvedPanel() {
		
	}
}