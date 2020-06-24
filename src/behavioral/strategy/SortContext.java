package behavioral.strategy;

/**
 * The Class SortContext.
 */
public class SortContext {

	/** The strategy. */
	private SortStrategy strategy = new InsertionSortStrategy();

	/**
	 * Sets the sort strategy.
	 *
	 * @param strategy the new sort strategy
	 */
	public void setSortStrategy(SortStrategy strategy) {
		this.strategy = strategy;
	}

	/**
	 * Sort.
	 */
	public void sort() {
		strategy.sort();
	}

}
