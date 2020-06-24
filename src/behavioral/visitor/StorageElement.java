package behavioral.visitor;

/**
 * The Interfacce StorageElement.
 */
public interface StorageElement {

	/**
	 * Accept.
	 *
	 * @param visitor the visitor
	 * @return the int
	 */
	int accept(StorageVisitor visitor);

}
