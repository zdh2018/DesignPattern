package BuilderPattern;

/**
 * @author zdh
 * @create 2021-08-11 11:11
 */
public class ChickenBurger extends Burger{
    @Override
    public float price() {
        return 50.5f;
    }

    @Override
    public String name() {
        return "Chicken Burger";
    }
}
