package headfirst.designpatterns.singleton;

// 线程安全的懒汉式
public class Singleton5 {

    private static Singleton5 uniqueInstance;

    private Singleton5() {

    }

    public static synchronized Singleton5 getInstance() {
        if (uniqueInstance == null) {
            uniqueInstance = new Singleton5();
        }
        return uniqueInstance;
    }

}
