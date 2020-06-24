package structural.adapter;

/**
 * The Class MinuteUnit.
 */
public class MinuteUnit implements Unit {

	/** The minutes. */
	private int minutes;

	/**
	 * Instantiates a new minute unit.
	 *
	 * @param minutes the minutes
	 */
	public MinuteUnit(int minutes) {
		this.minutes = minutes;
	}

	/**
	 * Gets the data.
	 *
	 * @return the data
	 */
	@Override
	public int getData() {
		return minutes;
	}

}
