package headfirst.designpatterns.factory.pizzafm;

public class NYPizzaStore extends PizzaStore {

    Pizza createPizza(String item) {
        if ("cheese".equals(item)) {
            return new NYStyleCheesePizza();
        } else if ("veggie".equals(item)) {
            return new NYStyleVeggiePizza();
        } else if ("clam".equals(item)) {
            return new NYStyleClamPizza();
        } else if ("pepperoni".equals(item)) {
            return new NYStylePepperoniPizza();
        } else return null;
    }
}
