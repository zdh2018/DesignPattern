package BuilderPattern;

/**
 * @author zdh
 * @create 2021-08-11 11:08
 */
public abstract class ColdDrink implements Item {

    @Override
    public Packing packing() {
        return new Bottle();
    }

    @Override
    public abstract float price();
}
