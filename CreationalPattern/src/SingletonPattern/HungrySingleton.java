package SingletonPattern;

/**
 * @author zdh
 * @create 2021-08-11 0:00
 */

/**
 *
 * 在类加载时就进行初始化，浪费内存，产生垃圾对象，但是没有加锁，执行效率会提高
 */
public class HungrySingleton {
    private static HungrySingleton instance = new HungrySingleton();
    private HungrySingleton(){

    }
    public static HungrySingleton getInstance(){
        return instance;
    }
}
