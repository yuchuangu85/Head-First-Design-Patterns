package headfirst.designpatterns.factory.abstractfactory.factory;

import headfirst.designpatterns.factory.abstractfactory.product.material.Cheese.Cheese;
import headfirst.designpatterns.factory.abstractfactory.product.material.Cheese.ReggianoCheese;
import headfirst.designpatterns.factory.abstractfactory.product.material.Clam.Clam;
import headfirst.designpatterns.factory.abstractfactory.product.material.Clam.FreshClam;
import headfirst.designpatterns.factory.abstractfactory.product.material.Sauce.MarinaraSauce;
import headfirst.designpatterns.factory.abstractfactory.product.material.Sauce.Sauce;
import headfirst.designpatterns.factory.abstractfactory.product.material.dough.Dough;
import headfirst.designpatterns.factory.abstractfactory.product.material.dough.ThinCrustDough;

public class NYPizzaIngredientFactory implements PizzaIngredientFactory {

    @Override
    public Dough createDough() {
        return new ThinCrustDough();
    }

    @Override
    public Sauce createSauce() {
        return new MarinaraSauce();
    }

    @Override
    public Cheese createCheese() {
        return new ReggianoCheese();
    }

    @Override
    public Clam createClam() {
        return new FreshClam();
    }
}
