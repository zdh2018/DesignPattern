package BuilderPattern;

/**
 * @author zdh
 * @create 2021-08-11 11:07
 */
public abstract class Burger implements Item{
    @Override
    public Packing packing() {
        return new Wrapper();
    }

    @Override
    public abstract float price();
}
