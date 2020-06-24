package structural.proxy;

/**
 * The Class ProxyResponse.
 */
public class ProxyResponse implements Response {

	/** The real response. */
	private RealResponse realResponse = new RealResponse();

	/**
	 * Gets the response.
	 *
	 * @param request the request
	 * @return the response
	 */
	@Override
	public ResponseBean getResponse(String request) {
		ResponseBean response = realResponse.getResponse(request);
		response.setResponse(response.getResponse() + " --Proxied--");
		return response;
	}

}
