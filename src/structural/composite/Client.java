package structural.composite;

/**
 * The Class Client.
 */
public class Client {

	/**
	 * The main method.
	 *
	 * @param args the arguments
	 */
	public static void main(String[] args) {
		CompoundLogger compoundLogger = new CompoundLogger();
		Logger infoLogger1 = new InfoLogger("Log1");
		Logger infoLogger2 = new InfoLogger("Log2");
		compoundLogger.add(infoLogger1);
		compoundLogger.add(infoLogger2);
		CompoundLogger subLogger = new CompoundLogger();
		Logger infoLogger3 = new InfoLogger("Log3");
		subLogger.add(infoLogger3);
		compoundLogger.add(subLogger);
		compoundLogger.log();
		Logger infoLogger4 = new InfoLogger("Log4");
		compoundLogger.add(infoLogger4);
		compoundLogger.remove("Log4");
		compoundLogger.log();
	}

}
