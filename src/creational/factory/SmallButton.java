package creational.factory;

/**
 * The Class SmallButton.
 */
public class SmallButton implements Button {

	/** The button. */
	private String button;

	/**
	 * Instantiates a new small button.
	 */
	public SmallButton() {
		button = "SmallButton";
	}

	/**
	 * Gets the button.
	 *
	 * @return the button
	 */
	@Override
	public String getButton() {
		return button;
	}

}
