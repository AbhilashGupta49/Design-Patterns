package creational.prototype;

/**
 * The Class ComplexContainer.
 */
public class ComplexContainer implements Container {

	/** The Constant NAME. */
	private static final String NAME = "Complex Container";

	/**
	 * Clone container.
	 *
	 * @return the container
	 */
	@Override
	public Container cloneContainer() {
		return new ComplexContainer();
	}

	/**
	 * Start.
	 */
	@Override
	public void start() {
		System.out.println(NAME + " Started");
		System.out.println(NAME + " can do multiple things");
	}

}
