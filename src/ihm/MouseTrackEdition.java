package ihm;
import javax.swing.*;
import java.awt.*;

public class MouseTrackEdition {
	private boolean statusOn;
	
	public MouseTrackEdition() {
		statusOn = false;
	}
	
	public boolean getStatusOn() {
		return statusOn ;
	}

	public void setStatusOn(boolean bool) {
		statusOn = bool;
	}
}
