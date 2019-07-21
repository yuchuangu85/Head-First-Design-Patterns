package headfirst.designpatterns.factory.abstractfactory;

import headfirst.designpatterns.factory.abstractfactory.factory.ChicagoPizzaIngredientFactory;
import headfirst.designpatterns.factory.abstractfactory.factory.NYPizzaIngredientFactory;
import headfirst.designpatterns.factory.abstractfactory.product.pizza.Pizza;

public class FactoryClient {

    public static void main(String[] args) {
        PizzaStore pizzaStore = new NYStylePizzaStore(new NYPizzaIngredientFactory());
        orderPizza(pizzaStore);

        pizzaStore = new ChicagoStylePizzaStore(new ChicagoPizzaIngredientFactory());
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
