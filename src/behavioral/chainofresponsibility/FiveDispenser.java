package behavioral.chainofresponsibility;

/**
 * The Class FiveDispenser.
 */
public class FiveDispenser extends DispenserChain {

	/**
	 * Dispense.
	 *
	 * @param money the money
	 */
	@Override
	public void dispense(int money) {
		int num = money / 5;
		int rem = money % 5;
		if (num > 0) {
			System.out.println("Dispensed " + num + " Rs.5 coins");
		}
		chain.dispense(rem);
	}

}
