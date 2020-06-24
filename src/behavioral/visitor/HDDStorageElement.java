package behavioral.visitor;

/**
 * The Class HDDStorageElement.
 */
public class HDDStorageElement implements StorageElement {

	/** The price per TB. */
	private int pricePerTB;

	/** The quantity. */
	private int quantity;

	/**
	 * Instantiates a new HDD storage element.
	 *
	 * @param pricePerTB the price per TB
	 * @param quantity   the quantity
	 */
	public HDDStorageElement(int pricePerTB, int quantity) {
		super();
		this.pricePerTB = pricePerTB;
		this.quantity = quantity;
	}

	/**
	 * Accept.
	 *
	 * @param visitor the visitor
	 * @return the int
	 */
	@Override
	public int accept(StorageVisitor visitor) {
		return visitor.visit(this);
	}

	/**
	 * Gets the price per TB.
	 *
	 * @return the price per TB
	 */
	public int getPricePerTB() {
		return pricePerTB;
	}

	/**
	 * Sets the price per TB.
	 *
	 * @param pricePerTB the new price per TB
	 */
	public void setPricePerTB(int pricePerTB) {
		this.pricePerTB = pricePerTB;
	}

	/**
	 * Gets the quantity.
	 *
	 * @return the quantity
	 */
	public int getQuantity() {
		return quantity;
	}

	/**
	 * Sets the quantity.
	 *
	 * @param quantity the new quantity
	 */
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

}
