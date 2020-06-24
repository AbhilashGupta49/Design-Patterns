package creational.abstractfactory;

/**
 * The Class Chair.
 */
public class Chair {

	/** The chair. */
	private String chair = "CHAIR";

	/**
	 * Gets the chair.
	 *
	 * @return the chair
	 */
	public String getChair() {
		return chair;
	}

	/**
	 * Instantiates a new chair.
	 *
	 * @param chair the chair
	 */
	public Chair(String chair) {
		super();
		this.chair = chair;
	}

	/**
	 * Sets the chair.
	 *
	 * @param chair the new chair
	 */
	public void setChair(String chair) {
		this.chair = chair;
	}

}
