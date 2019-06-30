package headfirst.designpatterns.strategy.fly;

import headfirst.designpatterns.strategy.FlyBehavior;

/**
 * 具体的行为
 */
public class FlyRocketPowered implements FlyBehavior {
	@Override
	public void fly() {
		System.out.println("I'm flying with a rocket!");
	}
}
