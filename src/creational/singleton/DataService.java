package creational.singleton;

/**
 * The Class DataService.
 */
public class DataService {

	/** The data service. */
	private static DataService dataService;

	/** The data. */
	private String data;

	/**
	 * Instantiates a new data service.
	 */
	private DataService() {
		data = "Data in DataService instance";

	}

	/**
	 * Gets the single instance of DataService.
	 *
	 * @return single instance of DataService
	 */
	public static DataService getInstance() {
		if (dataService == null) {
			dataService = new DataService();
		}
		return dataService;
	}

	/**
	 * Gets the data.
	 *
	 * @return the data
	 */
	public String getData() {
		return data;
	}
}
