package creational.factory;

/**
 * The Class Client.
 */
public class Client {

	/**
	 * The main method.
	 *
	 * @param args the arguments
	 */
	public static void main(String[] args) {
		Button button = ButtonFactory.getButton(ButtonType.BIGBUTTON);
		System.out.println("Button - " + button.getButton());
	}

}
