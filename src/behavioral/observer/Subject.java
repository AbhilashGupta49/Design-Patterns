package behavioral.observer;

import java.util.ArrayList;
import java.util.List;

/**
 * The Class Subject.
 */
public class Subject {

	/** The observers. */
	private List<Observer> observers = new ArrayList<>();

	/** The state. */
	private int state;

	/**
	 * Adds the observer.
	 *
	 * @param o the o
	 */
	public void addObserver(Observer o) {
		observers.add(o);
	}

	/**
	 * Sets the state.
	 *
	 * @param val the new state
	 */
	public void setState(int val) {
		state = val;
		execute();
	}

	/**
	 * Gets the state.
	 *
	 * @return the state
	 */
	public int getState() {
		return state;
	}

	/**
	 * Execute.
	 */
	public void execute() {
		for (Observer o : observers) {
			o.update(state);
		}
	}
}
