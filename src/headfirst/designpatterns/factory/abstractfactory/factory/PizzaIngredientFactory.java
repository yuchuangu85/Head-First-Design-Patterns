package headfirst.designpatterns.factory.abstractfactory.factory;

import headfirst.designpatterns.factory.abstractfactory.product.material.Cheese.Cheese;
import headfirst.designpatterns.factory.abstractfactory.product.material.Clam.Clam;
import headfirst.designpatterns.factory.abstractfactory.product.material.Sauce.Sauce;
import headfirst.designpatterns.factory.abstractfactory.product.material.dough.Dough;

public interface PizzaIngredientFactory {

    Dough createDough();

    Sauce createSauce();

    Cheese createCheese();

    Clam createClam();

}
