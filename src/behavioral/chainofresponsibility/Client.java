package behavioral.chainofresponsibility;

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
		AtmDispenser dispenser = new AtmDispenser();
		dispenser.dispense(17);
	}
}
