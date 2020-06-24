package creational.prototype;

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
		Container simpleContainer = ContainerPrototypeFactory.getContainer("simple");
		simpleContainer.start();
		ContainerPrototypeFactory.addContainer("complex", new ComplexContainer());
		Container complexContainer = ContainerPrototypeFactory.getContainer("complex");
		complexContainer.start();
	}

}
