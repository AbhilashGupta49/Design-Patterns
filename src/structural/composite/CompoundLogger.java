package structural.composite;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Collectors;

/**
 * The Class CompoundLogger.
 */
public class CompoundLogger implements Logger {

	/** The logs. */
	private List<Logger> logs = new ArrayList<>();

	/**
	 * Adds the.
	 *
	 * @param log the log
	 */
	public void add(Logger log) {
		logs.add(log);
	}

	/**
	 * Removes the.
	 *
	 * @param removeLog the remove log
	 */
	public void remove(String removeLog) {
		Iterator<Logger> it = logs.iterator();
		while (it.hasNext()) {
			Logger log = it.next();
			if (log.getLogString().equalsIgnoreCase(removeLog)) {
				it.remove();
			}
		}
	}

	/**
	 * Log.
	 */
	@Override
	public void log() {
		for (Logger log : logs) {
			log.log();
		}
		logs = new ArrayList<>();
	}

	/**
	 * Gets the log string.
	 *
	 * @return the log string
	 */
	@Override
	public String getLogString() {
		return logs.stream().map(log -> log.getLogString()).collect(Collectors.joining(","));
	}

}
