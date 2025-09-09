package pizza;

public class CheesePizza implements Pizza {
    private final String name = "Cheese";

    @Override
    public String getName() { return name; }
    @Override
    public void prepare() { System.out.println("Preparing Cheese Pizza"); }
    @Override
    public void bake() { System.out.println("Baking Cheese Pizza"); }
    @Override
    public void cut() { System.out.println("Cutting Cheese Pizza"); }
    @Override
    public void box() { System.out.println("Boxing Cheese Pizza"); }
}