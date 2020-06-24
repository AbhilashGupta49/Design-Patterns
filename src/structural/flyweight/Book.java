package structural.flyweight;

/**
 * The Class Book.
 */
public class Book {

	/** The pages. */
	private int pages;

	/** The type. */
	private PageType type;

	/**
	 * Instantiates a new book.
	 *
	 * @param pages the pages
	 * @param type  the type
	 */
	public Book(int pages, PageType type) {
		this.pages = pages;
		this.type = type;
	}

	/**
	 * Prints the.
	 */
	public void print() {
		type.print(pages);
	}

}
