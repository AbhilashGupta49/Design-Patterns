package behavioral.observer;

/**
 * An asynchronous update interface for receiving notifications about Addition
 * information as the Addition is constructed.
 */
public class AdditionObserver extends Observer {

	/**
	 * This method is called when information about an Addition which was previously
	 * requested using an asynchronous interface becomes available.
	 *
	 * @param subject the subject
	 */
	public AdditionObserver(Subject subject) {
		this.subject = subject;
		subject.addObserver(this);
	}

	/**
	 * This method is called when information about an Addition which was previously
	 * requested using an asynchronous interface becomes available.
	 *
	 * @param val the val
	 */
	@Override
	public void update(int val) {
		System.out.println("Addition - " + (val + 100));
	}

}
