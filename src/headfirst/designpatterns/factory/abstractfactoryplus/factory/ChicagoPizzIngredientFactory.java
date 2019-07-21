package headfirst.designpatterns.factory.abstractfactoryplus.factory;

import headfirst.designpatterns.factory.abstractfactoryplus.product.material.Cheese.Cheese;
import headfirst.designpatterns.factory.abstractfactoryplus.product.material.Cheese.MozzarellaCheese;
import headfirst.designpatterns.factory.abstractfactoryplus.product.material.Clam.Clam;
import headfirst.designpatterns.factory.abstractfactoryplus.product.material.Clam.FrozenClam;
import headfirst.designpatterns.factory.abstractfactoryplus.product.material.Sauce.PlumTomatoSauce;
import headfirst.designpatterns.factory.abstractfactoryplus.product.material.Sauce.Sauce;
import headfirst.designpatterns.factory.abstractfactoryplus.product.material.dough.Dough;
import headfirst.designpatterns.factory.abstractfactoryplus.product.material.dough.ThickCrustDough;

public class ChicagoPizzIngredientFactory implements PizzaIngredientFactory {

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
