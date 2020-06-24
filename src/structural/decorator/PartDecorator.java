package structural.decorator;

/**
 * The Class PartDecorator.
 */
public class PartDecorator implements Part {

	/** The part. */
	private Part part;

	/**
	 * Instantiates a new part decorator.
	 *
	 * @param part the part
	 */
	public PartDecorator(Part part) {
		this.part = part;
	}

	/**
	 * Run.
	 */
	@Override
	public void run() {
		part.run();
	}

}
