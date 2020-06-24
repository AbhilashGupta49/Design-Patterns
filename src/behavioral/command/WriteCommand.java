package behavioral.command;

/**
 * The Class Writer.
 */
public class WriteCommand implements Command {

	/**
	 * Execute.
	 */
	@Override
	public void execute() {
		System.out.println("Write complete");
	}

}
