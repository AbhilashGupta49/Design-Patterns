package creational.factory;

/**
 * A factory for creating Button objects.
 */
public class ButtonFactory {

	/**
	 * Gets the button.
	 *
	 * @param buttonType the button type
	 * @return the button
	 */
	public static Button getButton(ButtonType buttonType) {
		Button button = null;
		switch (buttonType) {
		case BIGBUTTON:
			button = new BigButton();
			break;
		case SMALLBUTTON:
			button = new SmallButton();
			break;
		}
		return button;
	}

}
