package headfirst.designpatterns.strategy;

/**
 * 行为接口（相当于一种算法接口）
 * <p>
 * 飞行动作接口，每一个飞行类都必须实现这个接口
 */
public interface FlyBehavior {

	void fly();

}
