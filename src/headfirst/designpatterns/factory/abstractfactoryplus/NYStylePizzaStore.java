package headfirst.designpatterns.factory.abstractfactoryplus;


import headfirst.designpatterns.factory.abstractfactoryplus.factory.PizzaIngredientFactory;
import headfirst.designpatterns.factory.abstractfactoryplus.product.pizza.CheesePizza;
import headfirst.designpatterns.factory.abstractfactoryplus.product.pizza.ClamPizza;
import headfirst.designpatterns.factory.abstractfactoryplus.product.pizza.Pizza;

public class NYStylePizzaStore extends PizzaStore {

    PizzaIngredientFactory factory;

    public NYStylePizzaStore(PizzaIngredientFactory factory) {
        this.factory = factory;
    }

    @Override
    protected Pizza createPizza(String type) {
        if (type.equals("cheese")) {
            return new CheesePizza(factory);
        } else if (type.equals("veggie")) {
            return new ClamPizza(factory);
        } else {
            return null;
        }
    }

}
