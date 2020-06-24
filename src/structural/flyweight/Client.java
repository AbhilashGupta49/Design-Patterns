package structural.flyweight;

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
		Collection collection = new Collection();
		collection.addBook(100, "premium", 100);
		collection.addBook(500, "ultra premium", 200);
		collection.print();
	}

}
