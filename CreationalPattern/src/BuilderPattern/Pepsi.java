package BuilderPattern;

/**
 * @author zdh
 * @create 2021-08-11 11:12
 */
public class Pepsi extends ColdDrink {

    @Override
    public float price() {
        return 35.0f;
    }

    @Override
    public String name() {
        return "Pepsi";
    }
}