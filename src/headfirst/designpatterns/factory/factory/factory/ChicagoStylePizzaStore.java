package headfirst.designpatterns.factory.factory.factory;


import headfirst.designpatterns.factory.factory.product.Pizza;
import headfirst.designpatterns.factory.factory.product.chicagostyle.ChicagoStyleCheesePizza;
import headfirst.designpatterns.factory.factory.product.chicagostyle.ChicagoStyleClamPizza;
import headfirst.designpatterns.factory.factory.product.chicagostyle.ChicagoStylePepperoniPizza;
import headfirst.designpatterns.factory.factory.product.chicagostyle.ChicagoStyleVeggiePizza;

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
