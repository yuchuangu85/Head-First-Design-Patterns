package headfirst.designpatterns.factory.abstractfactory.factory;

import headfirst.designpatterns.factory.abstractfactory.product.material.Cheese.Cheese;
import headfirst.designpatterns.factory.abstractfactory.product.material.Cheese.MozzarellaCheese;
import headfirst.designpatterns.factory.abstractfactory.product.material.Clam.Clam;
import headfirst.designpatterns.factory.abstractfactory.product.material.Clam.FrozenClam;
import headfirst.designpatterns.factory.abstractfactory.product.material.Sauce.PlumTomatoSauce;
import headfirst.designpatterns.factory.abstractfactory.product.material.Sauce.Sauce;
import headfirst.designpatterns.factory.abstractfactory.product.material.dough.Dough;
import headfirst.designpatterns.factory.abstractfactory.product.material.dough.ThickCrustDough;

public class ChicagoPizzaIngredientFactory implements PizzaIngredientFactory {

    @Override
    public Dough createDough() {
        return new ThickCrustDough();
    }

    @Override
    public Sauce createSauce() {
        return new PlumTomatoSauce();
    }

    @Override
    public Cheese createCheese() {
        return new MozzarellaCheese();
    }

    @Override
    public Clam createClam() {
        return new FrozenClam();
    }
}
