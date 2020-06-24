package creational.abstractfactory;

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
		AbstractFactory factory = AbstractFactory.getFactory(Styles.MATTE);
		Chair chair = factory.createChair();
		Sofa sofa = factory.createSofa();
		System.out.println("Chair - " + chair.getChair() + ", Sofa - " + sofa.getSofa());
	}
}
