package creational.abstractfactory;

/**
 * A factory for creating Victorian objects.
 */
public class VictorianFactory extends AbstractFactory {

	/**
	 * Creates a new Victorian object.
	 *
	 * @return the chair
	 */
	@Override
	public Chair createChair() {
		return new Chair("VictorianChair");
	}

	/**
	 * Creates a new Victorian object.
	 *
	 * @return the sofa
	 */
	@Override
	public Sofa createSofa() {
		return new Sofa("VictorianSofa");
	}

}
