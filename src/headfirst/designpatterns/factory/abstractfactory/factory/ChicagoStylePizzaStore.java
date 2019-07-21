package headfirst.designpatterns.factory.abstractfactory.factory;


import headfirst.designpatterns.factory.abstractfactory.product.Pizza;
import headfirst.designpatterns.factory.abstractfactory.product.chicagostyle.ChicagoStyleCheesePizza;
import headfirst.designpatterns.factory.abstractfactory.product.chicagostyle.ChicagoStyleClamPizza;
import headfirst.designpatterns.factory.abstractfactory.product.chicagostyle.ChicagoStylePepperoniPizza;
import headfirst.designpatterns.factory.abstractfactory.product.chicagostyle.ChicagoStyleVeggiePizza;

public class ChicagoStylePizzaStore extends PizzaStore {

    @Override
    protected Pizza createPizza(String type) {
        if (type.equals("cheese")) {
            return new ChicagoStyleCheesePizza();
        } else if (type.equals("veggie")) {
            return new ChicagoStyleVeggiePizza();
        } else if (type.equals("clam")) {
            return new ChicagoStyleClamPizza();
        } else if (type.equals("pepperoni")) {
            return new ChicagoStylePepperoniPizza();
        } else {
            return null;
        }
    }
}
