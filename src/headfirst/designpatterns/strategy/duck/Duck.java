package headfirst.designpatterns.strategy.duck;

import headfirst.designpatterns.strategy.FlyBehavior;
import headfirst.designpatterns.strategy.QuackBehavior;

/**
 * 抽象鸭子对象
 *
 * 父类声明行为接口，子类实现具体的行为对象；通过多态可以动态替换实现相同接口的行为对象。
 */
public abstract class Duck {

	// 父类声明行为接口引用，子类实现具体的行为对象
	FlyBehavior flyBehavior;
	QuackBehavior quackBehavior;

	public abstract void display();

	public void performFly() {
		// 鸭子对象不亲自处理飞行行为，而是委托给flyBehavior引用的对象
		flyBehavior.fly();
	}

	public void performQuack() {
		// 鸭子对象不亲自处理呱呱叫行为，而是委托给quackBehavior引用的对象
		quackBehavior.quack();
	}

	public void swim() {
		System.out.println("ALL ducks float, even decoys!");
	}

	/**
	 * 动态替换飞行行为
	 *
	 * @param fb 具体的飞行行为
	 */
	public void setFlyBehavior(FlyBehavior fb) {
		flyBehavior = fb;
	}

	/**
	 * 动态替换呱呱叫行为
	 *
	 * @param qb 具体的呱呱叫行为
	 */
	public void setQuackBehavior(QuackBehavior qb) {
		quackBehavior = qb;
	}

}
