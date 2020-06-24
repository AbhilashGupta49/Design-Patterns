package behavioral.templatemethod;

/**
 * The Class GameStore.
 */
public class GameStore extends GameInstallTemplate {

	/**
	 * Do payment.
	 */
	@Override
	public void doPayment() {
		System.out.println("Paid at Store");
	}

	/**
	 * Gets the game.
	 *
	 * @return the game
	 */
	@Override
	public void getGame() {
		System.out.println("Game CD");
	}

}
