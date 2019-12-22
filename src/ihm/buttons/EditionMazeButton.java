package ihm.buttons;
import maze.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import java.awt.Color;
import ihm.MouseTrackEdition;

import java.awt.event.MouseListener;
import java.awt.event.MouseEvent;

public class EditionMazeButton extends JButton implements MouseListener{
	private String status;
	private int coordinateI;
	private int coordinateJ;
	private Color color;
	private Maze maze;
	private MouseTrackEdition trackOn;
	
	
	
	public EditionMazeButton(Maze maze, int coordinateI, int coordinateJ, MouseTrackEdition trackOn) {
		super();
		this.coordinateI = coordinateI;
		this.coordinateJ = coordinateJ;
		this.maze = maze;
		this.trackOn =trackOn;
		
		status = maze.getBox(this.coordinateI,this.coordinateJ).status();
		color = maze.getBox(this.coordinateI,this.coordinateJ).getColor();
		setBackground(color);
		


		addMouseListener(this);
		
	}
	
	public void mouseClicked(MouseEvent e) {
		if (status.contentEquals("E")) {
			status  = "W";
			WBox box = new WBox(coordinateI,coordinateJ);
			color = box.getColor();
			maze.setBox(coordinateI,coordinateJ, box);
		}
		else if (status.contentEquals("W")) {
			status  = "D";
			DBox box = new DBox(coordinateI,coordinateJ);
			color = box.getColor();
			maze.setBox(coordinateI,coordinateJ, box);
		}
		else if (status.contentEquals("D")) {
			status  = "A";
			ABox box = new ABox(coordinateI,coordinateJ);
			color = box.getColor();
			maze.setBox(coordinateI,coordinateJ, box);
		}
		else if (status.contentEquals("A")) {
			status  = "E";
			EBox box = new EBox(coordinateI,coordinateJ);
			color = box.getColor();
			maze.setBox(coordinateI,coordinateJ, box);
		}
		setBackground(color);
		setOpaque(true);
	}
	
	public String getStatus() {
		return status;
	}
	
	private void mouseTrack() {
		if (status.contentEquals("E")) {
			status  = "W";
			WBox box = new WBox(coordinateI,coordinateJ);
			color = box.getColor();
			maze.setBox(coordinateI,coordinateJ, box);
		}
 		else if (status.contentEquals("W")) {
			status  = "E";
			EBox box = new EBox(coordinateI,coordinateJ);
			color = box.getColor();
			maze.setBox(coordinateI,coordinateJ, box);
		}
		setBackground(color);
		setOpaque(true);
		
	}
	
 	
 	public void mouseEntered(MouseEvent e) {
 		if (trackOn.getStatusOn()) {
 			mouseTrack();
 		}
 	}
 	
 	public void mouseExited(MouseEvent e) {
 		
 	}
 	
 	public void mousePressed(MouseEvent e) {
 		trackOn.setStatusOn(true); ;
 		mouseTrack();
 		
 		
 	}
 	
 	public void mouseReleased(MouseEvent e) {
 		trackOn.setStatusOn(false);
 	}
	
}