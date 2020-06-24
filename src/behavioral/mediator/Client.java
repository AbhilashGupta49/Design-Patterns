package behavioral.mediator;

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
		Mediator mediator = new Mediator();
		Program devC = new Program("DevC", mediator);
		Program eclipse = new Program("Eclipse", mediator);
		Program vStudio = new Program("Visual Studio", mediator);
		mediator.addProgram(devC);
		mediator.addProgram(eclipse);
		mediator.addProgram(vStudio);
		eclipse.sendCommand("abcdef");
		devC.sendCommand("affaf");
	}

}
