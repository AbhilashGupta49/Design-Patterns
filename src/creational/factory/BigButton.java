package creational.factory;

/**
 * The Class BigButton.
 */
public class BigButton implements Button {

	/** The button. */
	private String button;

	/**
	 * Instantiates a new big button.
	 */
	public BigButton() {
		super();
		button = "BigButton";
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
