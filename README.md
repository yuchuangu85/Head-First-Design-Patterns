<h1 align="center">Head-First-Design-Patterns</h1>

<p align="center">
  <a href="http://codemx.cn"><img src="https://img.shields.io/badge/博客-blog-brightgreen.svg" alt="博客">
  </a>
</p>

>Head First 设计模式总结

## 分类
|类型|中文名称|英文名称|
|:---:|---|---|
|创建型模式|工厂方法模式<br>抽象工厂模式<br>单例模式<br>建造者模式<br>原型模式|Factory Method<br>Abstract Factory<br>Singleton<br>Builder<br>Prototype|
|结构型模式|适配器模式<br>装饰器模式<br>代理模式<br>外观模式<br>桥接模式<br>组合模式<br>享元模式|Adapter<br>Decorator<br>Proxy<br>Facade<br>Bridge<br>Composite<br>Flyweight|
|行为型模式|策略模式<br>模板方法模式<br>观察者模式<br>迭代器模式<br>责任链模式<br>命令模式<br>备忘录模式<br>状态模式<br>访问者模式<br>中介者模式<br>解释器模式|Strategy<br>Template Methed<br>Observer<br>Iterator<br>Chain Of Responsibility<br>Command<br>Memento<br>State<br>Visitor<br>Mediator<br>Interpreter|

## Java基础
* 抽象
* 封装
* 多态
* 继承

## Head First设计原则
* 找出应用中可能需要变化之处，把它们独立出来进行封装，不要和那些不需要变化的代码混在一起，以便以后可以轻易的改动或者扩充此部分，而不影响不需要变化的部分。
* 针对接口（抽象类或者接口）编程，而不是针对实现编程。（接口代表每个行为，而行为的每个实现都将实现其中的一个接口）--多态
* 多用组合，少用继承。

## 设计原则
* 单一职责原则
* 开闭原则
* 里氏替换原则
* 依赖导致原则
* 接口隔离原则
* 迪米特原则

## 设计模式
#### 策略模式（Strategy）
* 定义：定义了算法族，分别封装起来，让它们之间可以互相替换（多态），此模式让算法的变化独立于使用算法的客户。
* 类图
![Strategy](/uml/Strategy.png)


## 其他参考资料
* [二十三种设计模式](https://www.jianshu.com/p/4e01479b6a2c)
* [二十三种设计模式Github](https://github.com/Shimingli/AndriodDesignPattern)
* [23种设计模式全面解析（超级详细）](http://c.biancheng.net/design_pattern/)
* [图说设计模式](https://design-patterns.readthedocs.io/zh_CN/latest/index.html)

