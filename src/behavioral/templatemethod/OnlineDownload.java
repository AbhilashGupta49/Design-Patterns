package behavioral.templatemethod;

/**
 * The Class OnlineDownload.
 */
public class OnlineDownload extends GameInstallTemplate {

	/**
	 * Do payment.
	 */
	@Override
	public void doPayment() {
		System.out.println("Online Payment Done");
	}

	/**
	 * Gets the game.
	 *
	 * @return the game
	 */
	@Override
	public void getGame() {
		System.out.println("Game Downloaded");
	}

}
