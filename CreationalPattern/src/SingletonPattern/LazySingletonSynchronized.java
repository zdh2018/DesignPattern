package SingletonPattern;

/**
 * @author zdh
 * @create 2021-08-10 23:56
 */

/**
 *
 * 线程安全，能够在多线程中较好工作，但效率低
 * getInstance使用并不是很频繁
 */
public class LazySingletonSynchronized {
    private LazySingletonSynchronized(){}
    private static LazySingletonSynchronized instance;

    public static synchronized LazySingletonSynchronized getInstance(){
        if(instance == null){
            instance = new LazySingletonSynchronized();
        }
        return instance;
    }
}
