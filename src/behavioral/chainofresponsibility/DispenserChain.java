package behavioral.chainofresponsibility;

/**
 * The Class DispenserChain.
 */
public abstract class DispenserChain {

	/** The chain. */
	protected DispenserChain chain;

	/**
	 * Sets the next chain.
	 *
	 * @param chain the new next chain
	 */
	public void setNextChain(DispenserChain chain) {
		this.chain = chain;
	}

	/**
	 * Dispense.
	 *
	 * @param money the money
	 */
	public abstract void dispense(int money);
}
