package headfirst.designpatterns.strategy.quack;

import headfirst.designpatterns.strategy.QuackBehavior;

/**
 * 具体的行为
 */
public class Squack implements QuackBehavior {
	@Override
	public void quack() {
		// 橡皮鸭子呱呱叫
		System.out.println("Squack");
	}
}
