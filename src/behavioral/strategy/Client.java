package behavioral.strategy;

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
		SortContext sortContext = new SortContext();
		sortContext.sort();
		sortContext.setSortStrategy(new MergeSortStrategy());
		sortContext.sort();
	}

}
