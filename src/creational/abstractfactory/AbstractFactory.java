package creational.abstractfactory;

/**
 * A factory for creating Abstract objects.
 */
public abstract class AbstractFactory {

	/**
	 * Gets the factory.
	 *
	 * @param style the style
	 * @return the factory
	 */
	public static AbstractFactory getFactory(Styles style) {

		AbstractFactory factory = null;
		switch (style) {
		case MATTE:
			factory = new MatteFactory();
			break;
		case VICTORIAN:
			factory = new VictorianFactory();
			break;
		}
		return factory;
	}

	/**
	 * Creates a new Abstract object.
	 *
	 * @return the chair
	 */
	public abstract Chair createChair();

	/**
	 * Creates a new Abstract object.
	 *
	 * @return the sofa
	 */
	public abstract Sofa createSofa();

}
