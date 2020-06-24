package structural.bridge;

/**
 * The Class Red.
 */
public class Red implements Color {

	/**
	 * Paint.
	 */
	@Override
	public void paint() {
		System.out.println("Red Painted");

	}

	/**
	 * Gets the color name.
	 *
	 * @return the color name
	 */
	@Override
	public String getColorName() {
		return "Red";
	}

}
