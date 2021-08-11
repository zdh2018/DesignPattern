package SingletonPattern;

/**
 * @author zdh
 * @create 2021-08-10 23:51
 */
public class LazySingletonNonSynchronized {
    private LazySingletonNonSynchronized(){}
    public static LazySingletonNonSynchronized instance ;
    public static LazySingletonNonSynchronized getInstance(){
        if(instance == null)
            instance = new LazySingletonNonSynchronized();
        return instance;
    }

}
