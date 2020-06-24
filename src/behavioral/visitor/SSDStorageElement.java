package behavioral.visitor;

/**
 * The Class SSDStorageElement.
 */
public class SSDStorageElement implements StorageElement {

	/** The price per hundred GB. */
	private int pricePerHundredGB;

	/** The quantity. */
	private int quantity;

	/**
	 * Instantiates a new SSD storage element.
	 *
	 * @param pricePerHundredGB the price per hundred GB
	 * @param quantity          the quantity
	 */
	public SSDStorageElement(int pricePerHundredGB, int quantity) {
		super();
		this.pricePerHundredGB = pricePerHundredGB;
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
	 * Gets the price per hundred GB.
	 *
	 * @return the price per hundred GB
	 */
	public int getPricePerHundredGB() {
		return pricePerHundredGB;
	}

	/**
	 * Sets the price per hundred GB.
	 *
	 * @param pricePerHundredGB the new price per hundred GB
	 */
	public void setPricePerHundredGB(int pricePerHundredGB) {
		this.pricePerHundredGB = pricePerHundredGB;
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
