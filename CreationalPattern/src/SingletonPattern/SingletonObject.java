package SingletonPattern;

/**
 * @author zdh
 * @create 2021-08-10 23:44
 */
public class SingletonObject {
    private SingletonObject(){}

    public static SingletonObject instance = new SingletonObject();

    public static SingletonObject getInstance(){
        return instance;
    }

    public void showMessage(){
        System.out.println("SingletonObject: showMessage();");
    }
}
