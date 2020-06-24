package behavioral.templatemethod;

/**
 * The Class GameInstallTemplate.
 */
public abstract class GameInstallTemplate {

	/**
	 * Do payment.
	 */
	public abstract void doPayment();

	/**
	 * Gets the game.
	 *
	 * @return the game
	 */
	public abstract void getGame();

	/**
	 * Install game.
	 */
	public final void installGame() {
		doPayment();
		getGame();
		System.out.println("Game Installed!");
	}

}
