package creational.singleton;

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
		DataService dataService = DataService.getInstance();
//		DataService service = new DataService();  // DataService instance cannot be created from outside
		System.out.println(dataService.getData());
	}

}
