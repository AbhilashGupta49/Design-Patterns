package structural.proxy;

/**
 * The Class RealResponse.
 */
public class RealResponse implements Response {

	/**
	 * Gets the response.
	 *
	 * @param request the request
	 * @return the response
	 */
	@Override
	public ResponseBean getResponse(String request) {
		return new ResponseBean(1, request);
	}

}
