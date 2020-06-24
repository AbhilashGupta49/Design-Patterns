package behavioral.state;

public class VolumeButton {

	private VolumeState current = new LowVolumeState();

	public void setVolumeState(VolumeState state) {
		current = state;
	}

	public void pressButton() {
		current.pressButton(this);
	}

}
