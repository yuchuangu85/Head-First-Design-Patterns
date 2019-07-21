package headfirst.designpatterns.factory.abstractfactory.product.pizza;

import headfirst.designpatterns.factory.abstractfactory.factory.PizzaIngredientFactory;

public class CheesePizza extends Pizza {

    PizzaIngredientFactory factory;

    public CheesePizza(PizzaIngredientFactory factory) {
        this.factory = factory;
    }

    @Override
    public void prepare() {
        factory.createDough();
        factory.createCheese();
        factory.createSauce();
        factory.createClam();
    }

    @Override
    public void bake() {

    }

    @Override
    public void cut() {

    }

    @Override
    public void box() {

    }
}
