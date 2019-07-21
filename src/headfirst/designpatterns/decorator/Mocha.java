package headfirst.designpatterns.decorator;

// 装饰者
public class Mocha extends CondimentDecorator {

    // 被装饰者
    Beverage beverage;

    public Mocha(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return beverage.description + ", Mocha";
    }

    @Override
    public double cost() {
        return 0.20 + beverage.cost();
    }
}
