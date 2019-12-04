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
	
	
	public EditionMazeButton(Maze maze, int coordinateI, int coordinateJ) {
		super();
		this.coordinateI = coordinateI;
		this.coordinateJ = coordinateJ;
		
		status = maze.getBox(this.coordinateI,this.coordinateJ).status();
		color = maze.getBox(this.coordinateI,this.coordinateJ).getColor();
		

		addActionListener(this);
		
	}
	
	private void onClick() {
		if (status.contentEquals("W")) {
			status  = "E";
			color = Color.WHITE;
		}
		else if (status.contentEquals("E")) {
			status  = "D";
			color = Color.GREEN;
		}
		else if (status.contentEquals("D")) {
			status  = "A";
			color = Color.RED;
		}
		else if (status.contentEquals("A")) {
			status  = "W";
			color = Color.BLACK;
		}
	}
	
	public String getStatus() {
		return status;
	}
	
	public void actionPerformed(ActionEvent evt) {
		onClick();
	}
	
}