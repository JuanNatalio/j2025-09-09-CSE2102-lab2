package pizza;

public class GlutenFreePizza implements Pizza {
    private final String name = "GlutenFree";

    @Override
    public String getName() { return name; }
    @Override
    public void prepare() { System.out.println("Preparing Gluten Free Pizza"); }
    @Override
    public void bake() { System.out.println("Baking Gluten Free Pizza"); }
    @Override
    public void cut() { System.out.println("Cutting Gluten Free Pizza"); }
    @Override
    public void box() { System.out.println("Boxing Gluten Free Pizza"); }
}