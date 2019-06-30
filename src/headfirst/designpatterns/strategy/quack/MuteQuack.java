package headfirst.designpatterns.strategy.quack;

import headfirst.designpatterns.strategy.QuackBehavior;

/**
 * 具体的行为
 */
public class MuteQuack implements QuackBehavior {
	@Override
	public void quack() {
		// 什么都不做，不会叫
		System.out.println("<< Silence >>");
	}
}
