package structural.bridge;

/**
 * The Class Vehicle.
 */
public abstract class Vehicle {

	/** The color. */
	protected Color color;

	/**
	 * Paint color.
	 */
	public void paintColor() {
		color.paint();
	};

	/**
	 * Drive.
	 */
	public abstract void drive();

}
