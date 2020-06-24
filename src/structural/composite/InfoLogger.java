package structural.composite;

/**
 * The Class InfoLogger.
 */
public class InfoLogger implements Logger {

	/** The logging string. */
	private String loggingString;

	/**
	 * Instantiates a new info logger.
	 *
	 * @param log the log
	 */
	InfoLogger(String log) {
		loggingString = log;
	}

	/**
	 * Log.
	 */
	@Override
	public void log() {
		System.out.println(loggingString);
	}

	/**
	 * Gets the log string.
	 *
	 * @return the log string
	 */
	@Override
	public String getLogString() {
		return loggingString;
	}

}
