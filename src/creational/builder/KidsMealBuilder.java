package creational.builder;

/**
 * The Class KidsMealBuilder.
 */
public class KidsMealBuilder extends MealBuilder {

	/**
	 * Builds the burger.
	 */
	@Override
	public void buildBurger() {
		meal.setBurger("Kids Burger");
	}

	/**
	 * Builds the fries.
	 */
	@Override
	public void buildFries() {
		meal.setFries("Kids Fries");

	}

}
