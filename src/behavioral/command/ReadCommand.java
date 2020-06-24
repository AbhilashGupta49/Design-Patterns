package behavioral.command;

/**
 * The Class Reader.
 */
public class ReadCommand implements Command {

	/**
	 * Execute.
	 */
	@Override
	public void execute() {
		System.out.println("Read complete");
	}

}
