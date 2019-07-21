package headfirst.designpatterns.decorator;

public class StarbuzzCoffee {

    public static void main(String[] args) {
        Beverage beverage = new Espresso();
        System.out.println(beverage.getDescription() + " $" + beverage.cost());

        Beverage beverage1 = new DarkRoast();// 被装饰者
        beverage1 = new Mocha(beverage1);// 装饰DarkRoast，并且同时是被装饰者
        beverage1 = new Whip(beverage1);// 装饰Mocha
        System.out.println(beverage1.getDescription() + " $" + beverage1.cost());

        Beverage beverage2 = new HouseBlend();// 被装饰者
        beverage2 = new Mocha(beverage2);// 装饰DarkRoast，并且同时是被装饰者
        beverage2 = new Whip(beverage2);// 装饰Mocha
        System.out.println(beverage2.getDescription() + " $" + beverage2.cost());

    }

}
