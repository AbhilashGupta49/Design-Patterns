package structural.proxy;

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
		ProxyResponse response = new ProxyResponse();
		System.out.println(response.getResponse("Trial").getResponse());
	}

}
