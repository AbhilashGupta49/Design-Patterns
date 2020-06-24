package structural.facade;

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
		CalculatorFacade facade = new CalculatorFacade();
		System.out.println(facade.add(5, 5));
		System.out.println(facade.subtract(3, 2));
	}

}
