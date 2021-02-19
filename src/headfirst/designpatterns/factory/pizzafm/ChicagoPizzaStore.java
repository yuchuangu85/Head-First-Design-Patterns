package headfirst.designpatterns.factory.pizzafm;

public class ChicagoPizzaStore extends PizzaStore {

    Pizza createPizza(String item) {
        if ("cheese".equals(item)) {
            return new ChicagoStyleCheesePizza();
        } else if ("veggie".equals(item)) {
            return new ChicagoStyleVeggiePizza();
        } else if ("clam".equals(item)) {
            return new ChicagoStyleClamPizza();
        } else if ("pepperoni".equals(item)) {
            return new ChicagoStylePepperoniPizza();
        } else return null;
    }
}
