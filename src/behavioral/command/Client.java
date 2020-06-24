package behavioral.command;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

/**
 * The Class Client.
 */
public class Client {

	/**
	 * The main method.
	 *
	 * @param args the arguments
	 * @throws InterruptedException the interrupted exception
	 */
	public static void main(String[] args) throws InterruptedException {
		List<Command> commands = prepareCommands();
		System.out.println("Starting commands");
		TimeUnit.SECONDS.sleep(2);
		executeCommands(commands);
	}

	/**
	 * Prepare commands.
	 *
	 * @return the list
	 */
	public static List<Command> prepareCommands() {
		List<Command> commands = new ArrayList<>();
		commands.add(new ReadCommand());
		commands.add(new WriteCommand());
		return commands;
	}

	/**
	 * Execute commands.
	 *
	 * @param commands the commands
	 */
	public static void executeCommands(List<Command> commands) {
		for (Command command : commands) {
			command.execute();
		}
	}
}
