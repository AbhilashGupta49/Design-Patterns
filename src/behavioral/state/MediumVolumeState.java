package behavioral.state;

public class MediumVolumeState extends VolumeState {

	/**
	 * Instantiates a new medium volume state.
	 */
	public MediumVolumeState() {
		super("Medium");
	}

	@Override
	public void pressButton(VolumeButton button) {
		button.setVolumeState(new HighVolumeState());
	}

}
