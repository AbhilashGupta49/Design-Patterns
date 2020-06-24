package behavioral.memento;

/**
 * The Class GameBean.
 */
public class GameBean {

	/** The state. */
	private Coordinate state;

	/**
	 * Sets the state.
	 *
	 * @param coordinate the new state
	 */
	public void setState(Coordinate coordinate) {
		System.out.println("Coordinates set to - (" + coordinate.getX() + "," + coordinate.getY() + ")");
		state = coordinate;
	}

	/**
	 * Save.
	 *
	 * @return the memento
	 */
	public Memento save() {
		System.out.println("Saved");
		return new Memento(state);
	}

	/**
	 * Restore.
	 *
	 * @param memento the memento
	 */
	public void restore(Memento memento) {
		state = memento.getState();
		System.out.println("Restored to (" + state.getX() + "," + state.getY() + ")");
	}

}
