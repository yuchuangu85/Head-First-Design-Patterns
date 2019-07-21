package headfirst.designpatterns.singleton;

// 双重校验锁式
public class Singleton3 {

    private volatile static Singleton3 uniqueInstance;

    private Singleton3() {
    }

    public static Singleton3 getInstance() {
        if (uniqueInstance == null) {
            synchronized (Singleton3.class) {
                if (uniqueInstance == null) {
                    uniqueInstance = new Singleton3();
                }
            }
        }
        return uniqueInstance;
    }

}
