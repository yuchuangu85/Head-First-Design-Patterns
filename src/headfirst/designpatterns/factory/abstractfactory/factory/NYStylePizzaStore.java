package headfirst.designpatterns.factory.abstractfactory.factory;


import headfirst.designpatterns.factory.abstractfactory.product.Pizza;
import headfirst.designpatterns.factory.abstractfactory.product.nystyle.NYStyleCheesePizza;
import headfirst.designpatterns.factory.abstractfactory.product.nystyle.NYStyleClamPizza;
import headfirst.designpatterns.factory.abstractfactory.product.nystyle.NYStylePepperoniPizza;
import headfirst.designpatterns.factory.abstractfactory.product.nystyle.NYStyleVeggiePizza;

public class NYStylePizzaStore extends PizzaStore {

    @Override
    protected Pizza createPizza(String type) {
        if (type.equals("cheese")) {
            return new NYStyleCheesePizza();
        } else if (type.equals("veggie")) {
            return new NYStyleVeggiePizza();
        } else if (type.equals("clam")) {
            return new NYStyleClamPizza();
        } else if (type.equals("pepperoni")) {
            return new NYStylePepperoniPizza();
        } else {
            return null;
        }
    }

}
