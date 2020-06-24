package creational.abstractfactory;

/**
 * The Class Sofa.
 */
public class Sofa {

	/** The sofa. */
	private String sofa = "SOFA";

	/**
	 * Gets the sofa.
	 *
	 * @return the sofa
	 */
	public String getSofa() {
		return sofa;
	}

	/**
	 * Sets the sofa.
	 *
	 * @param sofa the new sofa
	 */
	public void setSofa(String sofa) {
		this.sofa = sofa;
	}

	/**
	 * Instantiates a new sofa.
	 *
	 * @param sofa the sofa
	 */
	public Sofa(String sofa) {
		super();
		this.sofa = sofa;
	}

}
