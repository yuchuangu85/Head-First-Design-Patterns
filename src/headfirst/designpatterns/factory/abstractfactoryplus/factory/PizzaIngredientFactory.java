package headfirst.designpatterns.factory.abstractfactoryplus.factory;

import headfirst.designpatterns.factory.abstractfactoryplus.product.material.Cheese.Cheese;
import headfirst.designpatterns.factory.abstractfactoryplus.product.material.Clam.Clam;
import headfirst.designpatterns.factory.abstractfactoryplus.product.material.Sauce.Sauce;
import headfirst.designpatterns.factory.abstractfactoryplus.product.material.dough.Dough;

public interface PizzaIngredientFactory {

    Dough createDough();

    Sauce createSauce();

    Cheese createCheese();

    Clam createClam();

}
