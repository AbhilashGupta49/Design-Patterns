package behavioral.visitor;

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
		StorageElement[] storages = new StorageElement[] { new HDDStorageElement(1000, 3),
				new SSDStorageElement(500, 1), new HDDStorageElement(1500, 2) };
		StorageVisitor visitor = new StorageVisitor();
		int sum = 0;
		for (StorageElement storage : storages) {
			sum += storage.accept(visitor);
		}
		System.out.println("Total Cost - " + sum);
	}
}
