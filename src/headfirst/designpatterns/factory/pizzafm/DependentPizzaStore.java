package headfirst.designpatterns.factory.pizzafm;

public class DependentPizzaStore {

    public Pizza createPizza(String style, String type) {
        Pizza pizza = null;
        if ("NY".equals(style)) {
            if ("cheese".equals(type)) {
                pizza = new NYStyleCheesePizza();
            } else if ("veggie".equals(type)) {
                pizza = new NYStyleVeggiePizza();
            } else if ("clam".equals(type)) {
                pizza = new NYStyleClamPizza();
            } else if ("pepperoni".equals(type)) {
                pizza = new NYStylePepperoniPizza();
            }
        } else if ("Chicago".equals(style)) {
            if ("cheese".equals(type)) {
                pizza = new ChicagoStyleCheesePizza();
            } else if ("veggie".equals(type)) {
                pizza = new ChicagoStyleVeggiePizza();
            } else if ("clam".equals(type)) {
                pizza = new ChicagoStyleClamPizza();
            } else if ("pepperoni".equals(type)) {
                pizza = new ChicagoStylePepperoniPizza();
            }
        } else {
            System.out.println("Error: invalid type of pizza");
            return null;
        }
        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();
        return pizza;
    }
}
