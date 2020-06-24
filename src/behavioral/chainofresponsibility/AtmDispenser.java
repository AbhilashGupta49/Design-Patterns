package behavioral.chainofresponsibility;

/**
 * The Class AtmDispenser.
 */
public class AtmDispenser extends DispenserChain {

	/**
	 * Dispense.
	 *
	 */
	public AtmDispenser() {
		chain = new FiveDispenser();
		chain.setNextChain(new OneDispenser());
	}

	/**
	 * Dispense.
	 *
	 * @param money the money
	 */
	@Override
	public void dispense(int money) {
		chain.dispense(money);
	}

}
