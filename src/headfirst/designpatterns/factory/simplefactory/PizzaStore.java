package headfirst.designpatterns.factory.simplefactory;

import headfirst.designpatterns.factory.simplefactory.factory.SimplePizzaFactory;
import headfirst.designpatterns.factory.simplefactory.product.Pizza;

// 客户端
public class PizzaStore {

    SimplePizzaFactory factory;

    // 可以使用不同的工厂，创建不同的产品对象
    public PizzaStore(SimplePizzaFactory factory) {
        this.factory = factory;
    }

    public Pizza orderPizza(String type) {

        // 通过工厂创建对应的产品对象
        Pizza pizza = factory.createPizza(type);

        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();
        return pizza;
    }

}
