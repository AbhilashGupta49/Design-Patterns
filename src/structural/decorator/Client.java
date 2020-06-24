package structural.decorator;

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
		Part part = new MemoryChip(new MemoryChip(new CPU(8)));
		part.run();
	}
}
