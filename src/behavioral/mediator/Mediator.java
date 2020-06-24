package behavioral.mediator;

import java.util.ArrayList;
import java.util.List;

/**
 * The Class Mediator.
 */
public class Mediator {

	/** The programs. */
	List<Program> programs = new ArrayList<>();

	/**
	 * Adds the program.
	 *
	 * @param program the program
	 */
	public void addProgram(Program program) {
		programs.add(program);
	}

	/**
	 * Send command.
	 *
	 * @param command the command
	 * @param program the program
	 */
	public void sendCommand(String command, Program program) {
		for (Program p : programs) {
			if (p != program) {
				p.receiveCommand(command);
			}
		}
	}
}
