package structural.bridge;

/**
 * The Class Client.
 */
public class Client {

	/**
	 * The main method.
	 *
	 * @param args the arguments
	 */
	public static void main(String[] args) {
		Vehicle car = new Car(new Green());
		car.paintColor();
		car.drive();
		Vehicle bike = new Bike(new Red());
		bike.paintColor();
		bike.drive();
		car = new Car(new Red());
		car.paintColor();
		car.drive();
	}

}
