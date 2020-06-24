package creational.builder;

/**
 * The Class MealBuilder.
 */
public abstract class MealBuilder {

	/** The meal. */
	protected Meal meal;

	/**
	 * Construct new meal.
	 */
	public void constructNewMeal() {
		meal = new Meal();
	}

	/**
	 * Builds the burger.
	 */
	public abstract void buildBurger();

	/**
	 * Builds the fries.
	 */
	public abstract void buildFries();

	/**
	 * Gets the meal.
	 *
	 * @return the meal
	 */
	public Meal getMeal() {
		return meal;
	}

}
