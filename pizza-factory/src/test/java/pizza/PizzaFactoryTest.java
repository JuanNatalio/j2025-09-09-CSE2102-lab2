package pizza;

import factory.PizzaFactory;
import factory.SimplePizzaFactory;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class PizzaFactoryTest {
    private PizzaFactory pizzaFactory;

    @Before
    public void setUp() {
        pizzaFactory = new SimplePizzaFactory();
    }

    @Test
    public void testCreateCheesePizza() {
        Pizza pizza = pizzaFactory.createPizza("Cheese");
        assertNotNull(pizza);
        assertTrue(pizza instanceof CheesePizza);
    }

    @Test
    public void testCreateGreekPizza() {
        Pizza pizza = pizzaFactory.createPizza("Greek");
        assertNotNull(pizza);
        assertTrue(pizza instanceof GreekPizza);
    }

    @Test
    public void testCreatePeperoniPizza() {
        Pizza pizza = pizzaFactory.createPizza("Peperoni");
        assertNotNull(pizza);
        assertTrue(pizza instanceof PeperoniPizza);
    }

    @Test
    public void testCreateGlutenFreePizza() {
        Pizza pizza = pizzaFactory.createPizza("GlutenFree");
        assertNotNull(pizza);
        assertTrue(pizza instanceof GlutenFreePizza);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testCreateUnknownPizza() {
        pizzaFactory.createPizza("Unknown");
    }
}