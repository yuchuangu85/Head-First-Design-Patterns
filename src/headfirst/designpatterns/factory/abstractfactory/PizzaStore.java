package headfirst.designpatterns.factory.abstractfactory;


import headfirst.designpatterns.factory.abstractfactory.product.pizza.Pizza;

// 客户端
public abstract class PizzaStore {

    public Pizza orderPizza(String type) {

        // 通过工厂创建对应的产品对象
        Pizza pizza = createPizza(type);

        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();
        return pizza;
    }

    protected abstract Pizza createPizza(String type);

}
