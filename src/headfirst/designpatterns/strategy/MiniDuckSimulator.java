package headfirst.designpatterns.strategy;

import headfirst.designpatterns.strategy.duck.Duck;
import headfirst.designpatterns.strategy.duck.MallardDuck;
import headfirst.designpatterns.strategy.duck.ModelDuck;
import headfirst.designpatterns.strategy.fly.FlyRocketPowered;

public class MiniDuckSimulator {

	public static void main(String[] args) {
		Duck mallard = new MallardDuck();
		mallard.performFly();
		mallard.performQuack();

		Duck model = new ModelDuck();
		model.performFly();
		// 动态替换原来的飞行行为(算法族)
		model.setFlyBehavior(new FlyRocketPowered());
		model.performFly();
	}

}
