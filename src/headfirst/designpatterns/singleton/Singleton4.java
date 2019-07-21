package headfirst.designpatterns.singleton;

// 静态内部类式
public class Singleton4 {

    private static class Singleton4Holder {
        static Singleton4 uniqueInstance = new Singleton4();
    }

    private Singleton4() {

    }

    public static Singleton4 getInstance() {
        return Singleton4Holder.uniqueInstance;
    }

}
