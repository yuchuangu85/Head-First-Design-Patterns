package headfirst.designpatterns.factory.abstractfactory;

import headfirst.designpatterns.factory.abstractfactory.factory.ChicagoStylePizzaStore;
import headfirst.designpatterns.factory.abstractfactory.factory.NYStylePizzaStore;
import headfirst.designpatterns.factory.abstractfactory.factory.PizzaStore;
import headfirst.designpatterns.factory.abstractfactory.product.Pizza;

public class FactoryClient {

    public static void main(String[] args) {
        PizzaStore pizzaStore = new NYStylePizzaStore();
        orderPizza(pizzaStore);

        pizzaStore = new ChicagoStylePizzaStore();
        orderPizza(pizzaStore);
    }

    private static void orderPizza(PizzaStore pizzaStore) {
        Pizza pizza = pizzaStore.orderPizza("cheese");
        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();
    }

}
