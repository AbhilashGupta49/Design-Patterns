package structural.proxy;

/**
 * The Class ResponseBean.
 */
public class ResponseBean {

	/** The id. */
	private int id;

	/** The response. */
	private String response;

	/**
	 * Instantiates a new response bean.
	 *
	 * @param id       the id
	 * @param response the response
	 */
	public ResponseBean(int id, String response) {
		super();
		this.id = id;
		this.response = response;
	}

	/**
	 * Gets the id.
	 *
	 * @return the id
	 */
	public int getId() {
		return id;
	}

	/**
	 * Sets the id.
	 *
	 * @param id the new id
	 */
	public void setId(int id) {
		this.id = id;
	}

	/**
	 * Gets the response.
	 *
	 * @return the response
	 */
	public String getResponse() {
		return response;
	}

	/**
	 * Sets the response.
	 *
	 * @param response the new response
	 */
	public void setResponse(String response) {
		this.response = response;
	}

}
