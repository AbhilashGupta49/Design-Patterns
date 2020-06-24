package creational.abstractfactory;

/**
 * A factory for creating Matte objects.
 */
public class MatteFactory extends AbstractFactory {

	/**
	 * Creates a new Matte object.
	 *
	 * @return the chair
	 */
	@Override
	public Chair createChair() {
		return new Chair("MatteChair");
	}

	/**
	 * Creates a new Matte object.
	 *
	 * @return the sofa
	 */
	@Override
	public Sofa createSofa() {
		return new Sofa("MatteSofa");
	}

}
