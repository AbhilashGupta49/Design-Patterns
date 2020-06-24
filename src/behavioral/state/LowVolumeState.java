package behavioral.state;

/**
 * The Class LowVolumeState.
 */
public class LowVolumeState extends VolumeState {

	/**
	 * Instantiates a new low volume state.
	 */
	public LowVolumeState() {
		super("Low");
	}

	/**
	 * Press button.
	 *
	 * @param button the button
	 */
	@Override
	public void pressButton(VolumeButton button) {
		button.setVolumeState(new MediumVolumeState());
	}

}
