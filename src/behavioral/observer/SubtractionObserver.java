package behavioral.observer;

/**
 * An asynchronous update interface for receiving notifications about
 * Subtraction information as the Subtraction is constructed.
 */
public class SubtractionObserver extends Observer {

	/**
	 * This method is called when information about an Subtraction which was
	 * previously requested using an asynchronous interface becomes available.
	 *
	 * @param subject the subject
	 */
	public SubtractionObserver(Subject subject) {
		this.subject = subject;
		subject.addObserver(this);
	}

	/**
	 * This method is called when information about an Subtraction which was
	 * previously requested using an asynchronous interface becomes available.
	 *
	 * @param val the val
	 */
	@Override
	public void update(int val) {
		System.out.println("Subtraction - " + (val - 100));
	}

}
