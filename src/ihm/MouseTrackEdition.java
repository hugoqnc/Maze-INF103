package ihm;

public final class MouseTrackEdition {
	private boolean statusOn;
	private String statusBox;
	
	public MouseTrackEdition() {
		statusOn = false;
	}
	
	public final boolean getStatusOn() {
		return statusOn ;
	}
	public final String getStatusBox() {
		return statusBox ;
	}

	public final void setStatusOn(boolean bool) {
		statusOn = bool;
	}
	public final void setStatusBox(String s) {
		statusBox = s;
	}
}
