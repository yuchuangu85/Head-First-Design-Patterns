package headfirst.designpatterns.strategy.duck;

import headfirst.designpatterns.strategy.fly.FlyNoWay;
import headfirst.designpatterns.strategy.quack.Quack;

/**
 * 具体的鸭子
 * <p>
 * 鸭子的行为不是继承来的，而是和适当的行为对象“组合”来的
 */
public class ModelDuck extends Duck {

	public ModelDuck() {
		// 在子类声明指向实现相同接口的不同对象，不同对象对应不同的行为
		flyBehavior = new FlyNoWay();
		quackBehavior = new Quack();
	}

	@Override
	public void display() {
		System.out.println("I'm a model duck");
	}
}
