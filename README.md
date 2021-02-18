<h1 align="center">Head-First-Design-Patterns</h1>

<p align="center">
  <a href="http://codemx.cn"><img src="https://img.shields.io/badge/博客-blog-brightgreen.svg" alt="博客">
  </a>
</p>
[toc]


>Head First 设计模式总结

## 设计模式分类

---

|类型|中文名称|英文名称|
|:---:|---|---|
|创建型模式|[工厂方法模式](md/Factory.md)<br>[抽象工厂模式](md/AbstractFactory.md)<br>[简单工厂模式](md/SimpleFactory.md)<br>[单例模式](md/Singleton.md)<br>[建造者模式](md/Builder.md)<br>[原型模式](md/Prototype.md)|Factory Method<br>Abstract Factory<br>Simple Factory<br>Singleton<br>Builder<br>Prototype|
|结构型模式|[适配器模式](md/Adapter.md)<br>[装饰者模式](md/Decorator.md)<br>[代理模式](md/Proxy.md)<br>[外观模式](md/Facade.md)<br>[桥接模式](md/Bridge.md)<br>[组合模式](md/Composite.md)<br>[享元模式](md/Flyweight.md)|Adapter<br>Decorator<br>Proxy<br>Facade<br>Bridge<br>Composite<br>Flyweight|
|行为型模式|[策略模式](md/Strategy.md)<br>[模板方法模式](md/TemplateMethed.md)<br>[观察者模式](md/Observer.md)<br>[迭代器模式](md/Iterator.md)<br>[责任链模式](md/ChainOfResponsibility.md)<br>[命令模式](md/Command.md)<br>[备忘录模式](md/Memento.md)<br>[状态模式](md/State.md)<br>[访问者模式](md/Visitor.md)<br>[中介者模式](md/Mediator.md)<br>[解释器模式](md/Interpreter.md)|Strategy<br>Template Methed<br>Observer<br>Iterator<br>Chain Of Responsibility<br>Command<br>Memento<br>State<br>Visitor<br>Mediator<br>Interpreter|

* **创建型模式**：提供创建对象的机制，增加已有代码的灵活性和可复用性。
* **结构型模式**：介绍如何将对象和类组装成较大的结构，并同时保持结构的灵活和高效。
* **行为模式**：负责对象间的高效沟通和职责委派。

## Java基础

---

* 抽象
* 封装
* 多态
* 继承
   * 优点
      * 代码重用，减少创建类的成本，每个子类都拥有父类的方法和属性。
      * 子类和父类基本相似，但又与父类有所区别。
      * 提高代码的可扩展性。
   * 缺点
      * 继承是侵入性的，只要继承就必须拥有父类的所有属性和方法。
      * 可能造成子类代码冗余，灵活性降低，因为子类必须拥有父类的属性和方法。

## 六大设计原则

---

* 单一职责原则：就一个类而言，应该仅有一个引起它变化的原因
* 开闭原则：软件中的对象（类、模块、函数等）应该对于扩展是开放的，但是对于修改是封闭的
* 里氏替换原则：所有引用基类的地方必须能透明地使用其子类的对象。（核心：抽象）
* 依赖倒置原则
   * 高模块不应该依赖低模块，两者都应该依赖抽象
   * 抽象不应该依赖细节
   * 细节应该依赖抽象
* 接口隔离原则：客户端不应该依赖它不需要的接口（类间的依赖关系应该建立在最小的接口上）
* 迪米特原则：一个对象应该对其他对象有最少的了解

## Head First设计原则

---

* 找出应用中可能需要变化之处，把它们独立出来进行封装，不要和那些不需要变化的代码混在一起，以便以后可以轻易的改动或者扩充此部分，而不影响不需要变化的部分。
* 针对接口（抽象类或者接口）编程，而不是针对实现编程。（接口代表每个行为，而行为的每个实现都将实现其中的一个接口）--多态
* 多用组合，少用继承。
* 为了交互对象之间的松耦合设计而努力。
* 对扩展开放，对修改关闭--开闭原则

## UML图谱

---

<img src="media/image-20210218222749625.png" alt="image-20210218222749625" style="zoom:50%;" />

## ComputeHeatIndex

---

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

## 参考资料

----

* [二十三种设计模式Github](https://github.com/Shimingli/AndriodDesignPattern)
* [图说设计模式](https://design-patterns.readthedocs.io/zh_CN/latest/index.html)
* [深入理解设计模式](https://refactoringguru.cn/design-patterns)：多语言支持，多编程语言支持
* [Head First 设计模式源码整理](https://github.com/yuchuangu85/Head-First-Design-Patterns)：自己整理
* [二十三种设计模式](https://www.jianshu.com/p/4e01479b6a2c)：图文搭配讲解
* [AndriodDesignPattern 安卓的23种设计模式](https://github.com/Shimingli/AndriodDesignPattern)：图文代码综合讲解
* [图说设计模式](https://design-patterns.readthedocs.io/zh_CN/latest/index.html)：C#语言的设计模式
* [Java设计模式：23种设计模式全面解析（超级详细）](http://c.biancheng.net/design_pattern/)：概述讲解设计模式
* [java-design-patterns](https://github.com/iluwatar/java-design-patterns)：Java设计模式代码
* [java-design-patterns源码对应网站](https://java-design-patterns.com/patterns/)
* [java-design-patterns-example-tutorial](https://www.journaldev.com/1827/java-design-patterns-example-tutorial): Java Design Patterns tutorial Wibsite.
* [AndriodDesignPattern](https://github.com/Shimingli/AndriodDesignPattern)：二十三种设计模式（每个模式完成了一个小Demo）
* 《Head First Design Patterns》
* 《Android源码设计模式解析与实战》
* 《深入设计模式》
* 《设计模式：可复用面向对象软件的基础》
* 《图解设计模式》
* 《设计模式之禅》

