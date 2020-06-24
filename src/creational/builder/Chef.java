package creational.builder;

/**
 * The Class Chef.
 */
public class Chef {

	/** The meal builder. */
	private MealBuilder mealBuilder;

	/**
	 * Sets the meal builder.
	 *
	 * @param mb the new meal builder
	 */
	public void setMealBuilder(MealBuilder mb) {
		mealBuilder = mb;
	}

	/**
	 * Gets the meal.
	 *
	 * @return the meal
	 */
	public Meal getMeal() {
		return mealBuilder.getMeal();
	}

	/**
	 * Construct meal.
	 */
	public void constructMeal() {
		mealBuilder.constructNewMeal();
		mealBuilder.buildBurger();
		mealBuilder.buildFries();
	}

}
