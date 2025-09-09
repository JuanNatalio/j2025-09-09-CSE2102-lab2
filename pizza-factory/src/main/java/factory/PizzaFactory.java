package factory;

import pizza.Pizza;

public interface PizzaFactory {
    Pizza createPizza(String type);
}