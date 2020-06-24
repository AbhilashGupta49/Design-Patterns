package structural.adapter;

/**
 * The Class HourUnit.
 */
public class HourUnit implements Unit {

	/** The hours. */
	private int hours;

	/**
	 * Instantiates a new hour unit.
	 *
	 * @param hours the hours
	 */
	public HourUnit(int hours) {
		this.hours = hours;
	}

	/**
	 * Gets the data.
	 *
	 * @return the data
	 */
	@Override
	public int getData() {
		return hours;
	}

}
