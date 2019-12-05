package ihm.buttons;
import maze.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import java.awt.Color;

public class EditionMazeButton extends JButton implements ActionListener{
	private String status;
	private int coordinateI;
	private int coordinateJ;
	private Color color;
	private Maze maze;
	
	
	
	public EditionMazeButton(Maze maze, int coordinateI, int coordinateJ) {
		super();
		this.coordinateI = coordinateI;
		this.coordinateJ = coordinateJ;
		this.maze = maze;
		
		status = maze.getBox(this.coordinateI,this.coordinateJ).status();
		color = maze.getBox(this.coordinateI,this.coordinateJ).getColor();
		setBackground(color);
		

		addActionListener(this);
		
	}
	
	public void actionPerformed(ActionEvent evt) {
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
	}
	
	public String getStatus() {
		return status;
	}
	
}