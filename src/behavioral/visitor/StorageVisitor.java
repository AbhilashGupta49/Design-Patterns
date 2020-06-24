package behavioral.visitor;

/**
 * The Class StorageVisitor.
 */
public class StorageVisitor {

	/**
	 * Visit.
	 *
	 * @param hdd the hdd
	 * @return the int
	 */
	public int visit(HDDStorageElement hdd) {
		System.out.println("HDD(1TB," + hdd.getPricePerTB() + ") - " + hdd.getQuantity());
		return hdd.getPricePerTB() * hdd.getQuantity();
	}

	/**
	 * Visit.
	 *
	 * @param ssd the ssd
	 * @return the int
	 */
	public int visit(SSDStorageElement ssd) {
		System.out.println("SSD(100GB," + ssd.getPricePerHundredGB() + ") - " + ssd.getQuantity());
		int cost = ssd.getPricePerHundredGB() * ssd.getQuantity();
		System.out.println("Discount - " + (ssd.getQuantity() * 100));
		cost -= ssd.getQuantity() * 100;
		return cost;
	}

}
