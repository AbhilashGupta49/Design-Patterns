package structural.adapter;

/**
 * The Class MinuteUnitAdapter.
 */
public class MinuteUnitAdapter implements Adapter {

	/** The minutes. */
	private MinuteUnit minuteUnit;

	/**
	 * Instantiates a new minute unit adapter.
	 *
	 * @param hours the hours
	 */
	public MinuteUnitAdapter(Unit hours) {
		minuteUnit = new MinuteUnit(hours.getData() * 60);
	}

	/**
	 * Gets the converted data.
	 *
	 * @return the converted data
	 */
	@Override
	public MinuteUnit getConvertedData() {
		return minuteUnit;
	}

}
