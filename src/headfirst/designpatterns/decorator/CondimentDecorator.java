package headfirst.designpatterns.decorator;

/**
 * 调料装饰者--抽象类
 * 必须能取代Beverage，所以必须继承Beverage
 */
public abstract class CondimentDecorator extends Beverage {

    // 必须重新实现getDescription方法
   public abstract String getDescription();

}
