package structural.bridge;

/**
 * The Class Bike.
 */
public class Bike extends Vehicle {

	/**
	 * Instantiates a new bike.
	 *
	 * @param color the color
	 */
	public Bike(Color color) {
		this.color = color;
	}

	/**
	 * Drive.
	 */
	@Override
	public void drive() {
		System.out.println(color.getColorName() + " color bike 2 wheels drive");
	}

}
