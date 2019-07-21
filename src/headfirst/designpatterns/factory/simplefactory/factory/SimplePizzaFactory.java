package headfirst.designpatterns.factory.simplefactory.factory;

import headfirst.designpatterns.factory.simplefactory.product.CheesePizza;
import headfirst.designpatterns.factory.simplefactory.product.ClamPizza;
import headfirst.designpatterns.factory.simplefactory.product.PepperoniPizza;
import headfirst.designpatterns.factory.simplefactory.product.Pizza;
import headfirst.designpatterns.factory.simplefactory.product.VeggiePizza;

// 工厂处理创建对象的细节（只负责创建对象）
public class SimplePizzaFactory {

    public Pizza createPizza(String type) {
        Pizza pizza = null;

        if (type.equals("cheese")) {
            pizza = new CheesePizza();
        } else if (type.equals("pepperoni")) {
            pizza = new PepperoniPizza();
        } else if (type.equals("clam")) {
            pizza = new ClamPizza();
        } else if (type.equals("veggie")) {
            pizza = new VeggiePizza();
        }
        return pizza;
    }


}
