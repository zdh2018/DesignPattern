package BuilderPattern;

/**
 * @author zdh
 * @create 2021-08-11 11:11
 */
public class VegBurger extends Burger {
    @Override
    public float price() {
        return 25.0f;
    }

    @Override
    public String name() {
        return "Veg Burger";
    }
}
