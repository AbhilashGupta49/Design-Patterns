package structural.flyweight;

/**
 * The Class PageType.
 */
public class PageType {

	/** The quality. */
	private String quality;

	/** The thickness. */
	private int thickness;

	/**
	 * Instantiates a new page type.
	 *
	 * @param quality   the quality
	 * @param thickness the thickness
	 */
	public PageType(String quality, int thickness) {
		this.quality = quality;
		this.thickness = thickness;
	}

	/**
	 * Prints the.
	 *
	 * @param pages the pages
	 */
	public void print(int pages) {
		System.out.printf("Book printed. Pages - %d, Quality - %s, Thickness - %dmm", pages, quality, thickness);
	}

}
