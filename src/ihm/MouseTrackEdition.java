package ihm;
import javax.swing.*;
import java.awt.*;

public class MouseTrackEdition {
	private boolean statusOn;
	private String statusBox;
	
	public MouseTrackEdition() {
		statusOn = false;
	}
	
	public boolean getStatusOn() {
		return statusOn ;
	}
	public String getStatusBox() {
		return statusBox ;
	}

	public void setStatusOn(boolean bool) {
		statusOn = bool;
	}
	public void setStatusBox(String s) {
		statusBox = s;
	}
}
