package headfirst.designpatterns.factory.factory;

import headfirst.designpatterns.factory.factory.factory.ChicagoStylePizzaStore;
import headfirst.designpatterns.factory.factory.factory.NYStylePizzaStore;
import headfirst.designpatterns.factory.factory.factory.PizzaStore;
import headfirst.designpatterns.factory.factory.product.Pizza;

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
