
public class NutsTopping extends ToppingDecorator {
    public NutsTopping(Cake cake, BakeStrategy bakeStrategy) {
        super(cake, bakeStrategy);
    }

    @Override
    String cakeName() {
        return super.cakeName() + " with topping Nuts";
    }

    @Override
    int cakePrice() {
        return super.cakePrice() + 25;
    }
}
