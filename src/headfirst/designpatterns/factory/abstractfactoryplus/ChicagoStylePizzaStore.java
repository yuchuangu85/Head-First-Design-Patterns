package headfirst.designpatterns.factory.abstractfactoryplus;


import headfirst.designpatterns.factory.abstractfactoryplus.factory.PizzaIngredientFactory;
import headfirst.designpatterns.factory.abstractfactoryplus.product.pizza.ChicagoCheesePizza;
import headfirst.designpatterns.factory.abstractfactoryplus.product.pizza.ChicagoClamPizza;
import headfirst.designpatterns.factory.abstractfactoryplus.product.pizza.Pizza;

public class ChicagoStylePizzaStore extends PizzaStore {

    PizzaIngredientFactory factory;

    public ChicagoStylePizzaStore(PizzaIngredientFactory factory) {
        this.factory = factory;
    }

    @Override
    protected Pizza createPizza(String type) {
        if (type.equals("cheese")) {
            return new ChicagoCheesePizza(factory);
        } else if (type.equals("veggie")) {
            return new ChicagoClamPizza(factory);
        } else {
            return null;
        }
    }
}
