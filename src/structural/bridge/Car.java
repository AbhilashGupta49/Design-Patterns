package structural.bridge;

/**
 * The Class Car.
 */
public class Car extends Vehicle {

	/**
	 * Instantiates a new car.
	 *
	 * @param color the color
	 */
	public Car(Color color) {
		this.color = color;
	}

	/**
	 * Drive.
	 */
	@Override
	public void drive() {
		System.out.println(color.getColorName() + " color car 4 wheels drive");
	}

}
