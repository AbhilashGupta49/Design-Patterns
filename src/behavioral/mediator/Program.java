package behavioral.mediator;

/**
 * The Class Program.
 */
public class Program {

	/** The name. */
	private String name;

	/** The mediator. */
	private Mediator mediator;

	/**
	 * Instantiates a new program.
	 *
	 * @param name     the name
	 * @param mediator the mediator
	 */
	public Program(String name, Mediator mediator) {
		this.name = name;
		this.mediator = mediator;
	}

	/**
	 * Send command.
	 *
	 * @param command the command
	 */
	public void sendCommand(String command) {
		mediator.sendCommand(command, this);

	}

	/**
	 * Receive command.
	 *
	 * @param command the command
	 */
	public void receiveCommand(String command) {
		System.out.println("Command - " + command + " received by " + name);
	}

}
