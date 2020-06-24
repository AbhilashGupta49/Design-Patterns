package behavioral.templatemethod;

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
		GameInstallTemplate onlineDownload = new OnlineDownload();
		onlineDownload.installGame();
		System.out.println();
		GameInstallTemplate gameStore = new GameStore();
		gameStore.installGame();
	}
}
