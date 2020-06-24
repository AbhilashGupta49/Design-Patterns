package behavioral.iterator;

/**
 * The Class IntArray.
 */
public class IntArray {

	/** The array. */
	private int[] array;

	/**
	 * Sets the array.
	 *
	 * @param array the new array
	 */
	public void setArray(int[] array) {
		this.array = array;
	}

	/**
	 * Creates the iterator.
	 *
	 * @return the iterator
	 */
	public Iterator createIterator() {
		return new Iterator(this);
	}

	/**
	 * The Class Iterator.
	 */
	public static class Iterator {

		/** The array. */
		private IntArray array;

		/** The current. */
		private int current;

		/** The current pos. */
		private int currentPos;

		/**
		 * Instantiates a new iterator.
		 *
		 * @param array the array
		 */
		public Iterator(IntArray array) {
			this.array = array;
		}

		/**
		 * First.
		 */
		public void first() {
			currentPos = 0;
			current = array.array[currentPos];
		}

		/**
		 * Checks if is done.
		 *
		 * @return true, if is done
		 */
		public boolean isDone() {
			return currentPos == array.array.length;
		}

		/**
		 * Current item.
		 *
		 * @return the int
		 */
		public int currentItem() {
			return current;
		}

		/**
		 * Next.
		 */
		public void next() {
			currentPos++;
			if (!isDone()) {
				current = array.array[currentPos];
			}
		}

	}
}
