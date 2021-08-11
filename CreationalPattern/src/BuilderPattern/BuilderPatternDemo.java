package BuilderPattern;

/**
 * @author zdh
 * @create 2021-08-11 11:13
 */
public class BuilderPatternDemo {
    public static void main(String[] args) {
        MealBuilder mealBuilder = new MealBuilder();
        Meal nonVegMeal = mealBuilder.prepareNonVegMeal();
        System.out.println("NonVeg");
        nonVegMeal.showItems();

        Meal vegMeal = mealBuilder.prepareVegMeal();
        System.out.println("Veg");
        vegMeal.showItems();
    }
}
