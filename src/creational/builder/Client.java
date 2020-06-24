package creational.builder;

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
		Chef chef = new Chef();
		MealBuilder parentsMealBuilder = new ParentsMealBuilder();
		MealBuilder kidsMealBuilder = new KidsMealBuilder();
		chef.setMealBuilder(kidsMealBuilder);
		chef.constructMeal();
		Meal meal = chef.getMeal();
		System.out.println("1.  " + meal);
		chef.setMealBuilder(parentsMealBuilder);
		chef.constructMeal();
		meal = chef.getMeal();
		System.out.println("2.  " + meal);
	}

}
