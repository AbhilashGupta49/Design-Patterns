package behavioral.memento;

/**
 * The Class Memento.
 */
public class Memento {

	/** The state. */
	private Coordinate state;

	/**
	 * Instantiates a new memento.
	 *
	 * @param coordinate the coordinate
	 */
	public Memento(Coordinate coordinate) {
		state = coordinate;
	}

	/**
	 * Gets the state.
	 *
	 * @return the state
	 */
	public Coordinate getState() {
		return state;
	}

}
