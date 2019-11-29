
import maze.*;
import dijkstra.*;
import java.util.ArrayList;

import java.awt.Color;

import javax.swing.JFrame;
import javax.swing.JPanel;

import ihm.Window;

public class MainTest {

	public static void main(String[] args) {
	    Maze maze = new Maze("data/labyrinthe.txt");
		Window w = new Window("Labyrinthe", maze);
		

	}

}
