package behavioral.iterator;

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
		IntArray array = new IntArray();
		array.setArray(new int[] { 1, 5, 2, 5, 61, 12, 52, 2 });
		IntArray.Iterator it = array.createIterator();
		for (it.first(); !it.isDone(); it.next()) {
			System.out.println(it.currentItem());
		}
	}

}
