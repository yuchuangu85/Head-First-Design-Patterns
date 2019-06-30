package headfirst.designpatterns.strategy.fly;

import headfirst.designpatterns.strategy.FlyBehavior;

/**
 * 具体的行为
 */
public class FlyNoWay implements FlyBehavior {
	@Override
	public void fly() {
		// 什么都不做，不会飞
		System.out.println("I can't fly");
	}
}
