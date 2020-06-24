package structural.decorator;

/**
 * The Class CPU.
 */
public class CPU implements Part {

	/** The memory. */
	private int memory;

	/**
	 * Instantiates a new cpu.
	 *
	 * @param memory the memory
	 */
	public CPU(int memory) {
		this.memory = memory;
	}

	/**
	 * Run.
	 */
	@Override
	public void run() {
		System.out.println("Running with " + memory + " memory");
	}

}
