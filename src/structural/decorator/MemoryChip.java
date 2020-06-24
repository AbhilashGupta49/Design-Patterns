package structural.decorator;

/**
 * The Class MemoryChip.
 */
public class MemoryChip extends PartDecorator {

	/**
	 * Instantiates a new memory chip.
	 *
	 * @param part the part
	 */
	public MemoryChip(Part part) {
		super(part);
		// TODO Auto-generated constructor stub
	}

	/**
	 * Run.
	 */
	public void run() {
		super.run();
		System.out.println("Extra memory - " + 2);
	}

}
