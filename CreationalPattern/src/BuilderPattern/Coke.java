package BuilderPattern;

/**
 * @author zdh
 * @create 2021-08-11 11:12
 */
public class Coke extends ColdDrink {
    @Override
    public float price() {
        return 30.0f;
    }

    @Override
    public String name() {
        return "Coke";
    }
}
