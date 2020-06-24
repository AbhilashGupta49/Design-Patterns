package creational.prototype;

/**
 * The Class SimpleContainer.
 */
public class SimpleContainer implements Container {

	/** The Constant NAME. */
	private static final String NAME = "Simple Container";

	/**
	 * Clone container.
	 *
	 * @return the container
	 */
	@Override
	public Container cloneContainer() {
		return new SimpleContainer();
	}

	/**
	 * Start.
	 */
	@Override
	public void start() {
		System.out.println(NAME + " Started");
	}

}
