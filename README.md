<h1 align="center">Head-First-Design-Patterns</h1>

<p align="center">
  <a href="http://codemx.cn"><img src="https://img.shields.io/badge/博客-blog-brightgreen.svg" alt="博客">
  </a>
</p>

>Head First 设计模式总结

## 分类
|类型|中文名称|英文名称|
|:---:|---|---|
|创建型模式|[工厂方法模式](md/Factory.md)<br>[抽象工厂模式](md/AbstractFactory.md)<br>[简单工厂模式](md/SimpleFactory.md)<br>[单例模式](md/Singleton.md)<br>[建造者模式](md/Builder.md)<br>[原型模式](md/Prototype.md)|Factory Method<br>Abstract Factory<br>Simple Factory<br>Singleton<br>Builder<br>Prototype|
|结构型模式|[适配器模式](md/Adapter.md)<br>[装饰者模式](md/Decorator.md)<br>[代理模式](md/Proxy.md)<br>[外观模式](md/Facade.md)<br>[桥接模式](md/Bridge.md)<br>[组合模式](md/Composite.md)<br>[享元模式](md/Flyweight.md)|Adapter<br>Decorator<br>Proxy<br>Facade<br>Bridge<br>Composite<br>Flyweight|
|行为型模式|[策略模式](md/Strategy.md)<br>[模板方法模式](md/TemplateMethed.md)<br>[观察者模式](md/Observer.md)<br>[迭代器模式](md/Iterator.md)<br>[责任链模式](md/ChainOfResponsibility.md)<br>[命令模式](md/Command.md)<br>[备忘录模式](md/Memento.md)<br>[状态模式](md/State.md)<br>[访问者模式](md/Visitor.md)<br>[中介者模式](md/Mediator.md)<br>[解释器模式](md/Interpreter.md)|Strategy<br>Template Methed<br>Observer<br>Iterator<br>Chain Of Responsibility<br>Command<br>Memento<br>State<br>Visitor<br>Mediator<br>Interpreter|

>每个模式中的优点、缺点以及适用环境均来自 [图说设计模式](https://design-patterns.readthedocs.io/zh_CN/latest/index.html) 和 [23种设计模式全面解析（超级详细）](http://c.biancheng.net/design_pattern/)

## Java基础
* 抽象
* 封装
* 多态
* 继承

## Head First设计原则
* 找出应用中可能需要变化之处，把它们独立出来进行封装，不要和那些不需要变化的代码混在一起，以便以后可以轻易的改动或者扩充此部分，而不影响不需要变化的部分。
* 针对接口（抽象类或者接口）编程，而不是针对实现编程。（接口代表每个行为，而行为的每个实现都将实现其中的一个接口）--多态
* 多用组合，少用继承。
* 为了交互对象之间的松耦合设计而努力。
* 对扩展开放，对修改关闭--开闭原则

## 设计原则
* 单一职责原则
* 开闭原则
* 里氏替换原则
* 依赖倒置原则
* 接口隔离原则
* 迪米特原则

## ComputeHeatIndex
```java
private float computeHeatIndex(float t, float rh) {
	float index = (float)((16.923 + (0.185212 * t) + (5.37941 * rh) - (0.100254 * t * rh) +
		(0.00941695 * (t * t)) + (0.00728898 * (rh * rh)) +
		(0.000345372 * (t * t * rh)) - (0.000814971 * (t * rh * rh)) +
		(0.0000102102 * (t * t * rh * rh)) - (0.000038646 * (t * t * t)) + (0.0000291583 *  
		(rh * rh * rh)) + (0.00000142721 * (t * t * t * rh)) +
		(0.000000197483 * (t * rh * rh * rh)) - (0.0000000218429 * (t * t * t * rh * rh)) +     
		0.000000000843296 * (t * t * rh * rh * rh)) -
		(0.0000000000481975 * (t * t * t * rh * rh * rh)));
	return index;
}
```


## 其他参考资料
* [二十三种设计模式](https://www.jianshu.com/p/4e01479b6a2c)
* [二十三种设计模式Github](https://github.com/Shimingli/AndriodDesignPattern)
* [23种设计模式全面解析（超级详细）](http://c.biancheng.net/design_pattern/)
* [图说设计模式](https://design-patterns.readthedocs.io/zh_CN/latest/index.html)

