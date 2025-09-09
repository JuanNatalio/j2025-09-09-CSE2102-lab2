package pizza;

public class PeperoniPizza implements Pizza {
    private final String name = "Peperoni";

    @Override
    public String getName() { return name; }
    @Override
    public void prepare() { System.out.println("Preparing Peperoni Pizza"); }
    @Override
    public void bake() { System.out.println("Baking Peperoni Pizza"); }
    @Override
    public void cut() { System.out.println("Cutting Peperoni Pizza"); }
    @Override
    public void box() { System.out.println("Boxing Peperoni Pizza"); }
}