package SingletonPattern;

/**
 * @author zdh
 * @create 2021-08-10 23:47
 */
public class SingletonObjectDemo {
    public static void main(String[] args) {
        SingletonObject ob = SingletonObject.getInstance();
        ob.showMessage();
    }
}
