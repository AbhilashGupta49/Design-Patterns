package structural.flyweight;

import java.util.ArrayList;
import java.util.List;

/**
 * The Class Collection.
 */
public class Collection {

	/** The books. */
	private List<Book> books = new ArrayList<>();

	/**
	 * Adds the book.
	 *
	 * @param pages     the pages
	 * @param quality   the quality
	 * @param thickness the thickness
	 */
	public void addBook(int pages, String quality, int thickness) {
		Book book = new Book(pages, PageFactory.getPageType(quality, thickness));
		books.add(book);
	}

	/**
	 * Prints the.
	 */
	public void print() {
		for (Book book : books) {
			book.print();
		}
	}

}
