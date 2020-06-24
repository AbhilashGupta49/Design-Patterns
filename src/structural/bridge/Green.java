package structural.bridge;

/**
 * The Class Green.
 */
public class Green implements Color {

	/**
	 * Paint.
	 */
	@Override
	public void paint() {
		System.out.println("Green Painted");
	}

	/**
	 * Gets the color name.
	 *
	 * @return the color name
	 */
	@Override
	public String getColorName() {
		return "Green";
	}

}
