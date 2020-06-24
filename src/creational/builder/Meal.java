package creational.builder;

/**
 * The Class Meal.
 */
public class Meal {

	/** The burger. */
	private String burger;

	/** The fries. */
	private String fries;

	/**
	 * Gets the burger.
	 *
	 * @return the burger
	 */
	public String getBurger() {
		return burger;
	}

	/**
	 * Sets the burger.
	 *
	 * @param burger the new burger
	 */
	public void setBurger(String burger) {
		this.burger = burger;
	}

	/**
	 * Gets the fries.
	 *
	 * @return the fries
	 */
	public String getFries() {
		return fries;
	}

	/**
	 * Sets the fries.
	 *
	 * @param fries the new fries
	 */
	public void setFries(String fries) {
		this.fries = fries;
	}

	/**
	 * To string.
	 *
	 * @return the string
	 */
	@Override
	public String toString() {
		return "Meal - Burger (" + burger + "), Fries (" + fries + ")";
	}

}
