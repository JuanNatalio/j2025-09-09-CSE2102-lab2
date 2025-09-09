import factory.PizzaFactory;
import factory.SimplePizzaFactory;
import store.PizzaStore;
import pizza.Pizza;

public class Main {
    public static void main(String[] args) {
        PizzaFactory factory = new SimplePizzaFactory();
        PizzaStore store = new PizzaStore(factory);

        String[] pizzaTypes = {"cheese", "greek", "peperoni", "glutenfree"};
        for (String type : pizzaTypes) {
            System.out.println("\nOrdering a " + type + " pizza:");
            Pizza pizza = store.orderPizza(type);
            System.out.println("Ordered a " + pizza.getName() + " pizza!");
        }
    }
}