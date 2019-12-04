package ihm;
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
	Maze maze;
	
	
	
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
		if (status.contentEquals("W")) {
			status  = "E";
			color = Color.WHITE;
			EBox box = new EBox(coordinateI,coordinateJ);
			maze.setBox(coordinateI,coordinateJ, box);
		}
		else if (status.contentEquals("E")) {
			status  = "D";
			color = Color.GREEN;
			DBox box = new DBox(coordinateI,coordinateJ);
			maze.setBox(coordinateI,coordinateJ, box);
		}
		else if (status.contentEquals("D")) {
			status  = "A";
			color = Color.RED;
			ABox box = new ABox(coordinateI,coordinateJ);
			maze.setBox(coordinateI,coordinateJ, box);
		}
		else if (status.contentEquals("A")) {
			status  = "W";
			color = Color.BLACK;
			WBox box = new WBox(coordinateI,coordinateJ);
			maze.setBox(coordinateI,coordinateJ, box);
		}
		setBackground(color);
	}
	
	public String getStatus() {
		return status;
	}
	
}