package headfirst.designpatterns.factory.abstractfactoryplus;

import headfirst.designpatterns.factory.abstractfactoryplus.factory.ChicagoPizzIngredientFactory;
import headfirst.designpatterns.factory.abstractfactoryplus.factory.NYPizzaIngredientFactory;
import headfirst.designpatterns.factory.abstractfactoryplus.product.pizza.Pizza;

public class FactoryClient {

    public static void main(String[] args) {
        PizzaStore pizzaStore = new NYStylePizzaStore(new NYPizzaIngredientFactory());
        orderPizza(pizzaStore);

        pizzaStore = new ChicagoStylePizzaStore(new ChicagoPizzIngredientFactory());
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
