package behavioral.chainofresponsibility;

/**
 * The Class OneDispenser.
 */
public class OneDispenser extends DispenserChain {

	/**
	 * Dispense.
	 *
	 * @param money the money
	 */
	@Override
	public void dispense(int money) {
		System.out.println("Dispensed " + money + " Re. 1 coins");
	}

}
