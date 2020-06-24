package behavioral.memento;

import java.util.ArrayList;
import java.util.List;

/**
 * The Class Caretaker.
 */
public class Caretaker {

	/** The mementos. */
	private List<Memento> mementos = new ArrayList<>();

	/**
	 * Adds the memento.
	 *
	 * @param memento the memento
	 */
	public void addMemento(Memento memento) {
		mementos.add(memento);
	}

	/**
	 * Gets the memento.
	 *
	 * @return the memento
	 */
	public Memento getMemento() {
		return mementos.get(1);
	}

}
