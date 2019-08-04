package headfirst.designpatterns.adapter;

public class DuckTestDrive {

    public static void main(String[] args) {
        MallarDuck duck = new MallarDuck();
        WildTurkey turkey = new WildTurkey();

        // 借助适配器将WildTurkey转换成Duck接口
        Duck duckAdapter = new TurkeyAdapter(turkey);

        turkey.gobble();
        turkey.fly();

        testDuck(duck);
        testDuck(duckAdapter);

    }

    private static void testDuck(Duck duck) {
        duck.quack();
        duck.fly();
    }

}
