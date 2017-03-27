/**
 * Uses enumeration to show food types
 * @author Gavi
 *	
 */
public class FoodClasifier {

	public enum Foods {

		FRUIT("Apple"), MEAT("Beef"), CANDY("Lollipop");

		private final String food;

		/**
		 * Constructor for enum
		 * @param food the food belonging to the food group
		 * 
		 */
		Foods(String food) {
			this.food = food;
		}

		/**
		 * Returns specific food belionging to food type
		 * @return string represents the food from the type
		 */
		public String getFood() {
			return food;
		}

	}

	public static void main(String[] args) {
		Foods food1 = Foods.FRUIT;
		Foods food2 = Foods.MEAT;
		Foods food3 = Foods.CANDY;
		
		System.out.println(food1.food);
		System.out.println(food2.food);
		System.out.println(food3.food);

	}
}
