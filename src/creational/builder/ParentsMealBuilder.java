package creational.builder;

/**
 * The Class ParentsMealBuilder.
 */
public class ParentsMealBuilder extends MealBuilder {

	/**
	 * Builds the burger.
	 */
	@Override
	public void buildBurger() {
		meal.setBurger("Parents Burger");
	}

	/**
	 * Builds the fries.
	 */
	@Override
	public void buildFries() {
		meal.setFries("Parents Fries");
	}

}
