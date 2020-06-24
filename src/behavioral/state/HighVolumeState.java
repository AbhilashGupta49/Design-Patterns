package behavioral.state;

/**
 * The Class HighVolumeState.
 */
public class HighVolumeState extends VolumeState {

	/**
	 * Instantiates a new high volume state.
	 */
	public HighVolumeState() {
		super("High");
	}

	/**
	 * Press button.
	 *
	 * @param button the button
	 */
	@Override
	public void pressButton(VolumeButton button) {
		button.setVolumeState(new LowVolumeState());
	}

}
