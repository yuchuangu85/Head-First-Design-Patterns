package headfirst.designpatterns.strategy.quack;

import headfirst.designpatterns.strategy.QuackBehavior;

/**
 * 具体的行为
 */
public class Quack implements QuackBehavior {
	@Override
	public void quack() {
		// 实现呱呱叫
		System.out.println("Quack");
	}
}
