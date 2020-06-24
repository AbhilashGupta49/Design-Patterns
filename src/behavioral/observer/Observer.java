package behavioral.observer;

/**
 * The Class Observer.
 */
public abstract class Observer {

	/** The subject. */
	protected Subject subject;

	/**
	 * Update.
	 *
	 * @param val the val
	 */
	public abstract void update(int val);
}
