package structural.facade;

/**
 * The Class CalculatorFacade.
 */
public class CalculatorFacade {

	/**
	 * Adds the.
	 *
	 * @param a the a
	 * @param b the b
	 * @return the int
	 */
	public int add(int a, int b) {
		Addition addition = new Addition();
		return addition.add(a, b);
	}

	/**
	 * Subtract.
	 *
	 * @param a the a
	 * @param b the b
	 * @return the int
	 */
	public int subtract(int a, int b) {
		Subtraction subtraction = new Subtraction();
		return subtraction.subtract(a, b);
	}

}
