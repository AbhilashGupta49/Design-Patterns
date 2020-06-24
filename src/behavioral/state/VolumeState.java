package behavioral.state;

/**
 * The Interface VolumeState.
 */
public abstract class VolumeState {

	/** The state. */
	protected String state;

	/**
	 * Instantiates a new volume state.
	 *
	 * @param state the state
	 */
	public VolumeState(String state) {
		this.state = state;
		System.out.println(state + " Volume State");
	}

	/**
	 * Press button.
	 *
	 * @param button the button
	 */
	public abstract void pressButton(VolumeButton button);

}
