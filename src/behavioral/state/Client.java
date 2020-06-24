package behavioral.state;

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
		VolumeButton button = new VolumeButton();
		button.pressButton();
		button.pressButton();
		button.pressButton();
		button.pressButton();
	}

}
