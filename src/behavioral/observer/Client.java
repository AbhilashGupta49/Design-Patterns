package behavioral.observer;

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
		Subject subject = new Subject();
		new AdditionObserver(subject);
		new SubtractionObserver(subject);
		subject.setState(1500);
	}

}
