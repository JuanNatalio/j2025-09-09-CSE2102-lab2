package factory;

import pizza.Pizza;
import pizza.CheesePizza;
import pizza.GreekPizza;
import pizza.PeperoniPizza;
import pizza.GlutenFreePizza;

public class SimplePizzaFactory implements PizzaFactory {
    @Override
    public Pizza createPizza(String type) {
        if (type == null) return null;
        switch (type.toLowerCase()) {
            case "cheese":
                return new CheesePizza();
            case "greek":
                return new GreekPizza();
            case "peperoni":
                return new PeperoniPizza();
            case "glutenfree":
                return new GlutenFreePizza();
            default:
                throw new IllegalArgumentException("Unknown pizza type: " + type);
        }
    }
}