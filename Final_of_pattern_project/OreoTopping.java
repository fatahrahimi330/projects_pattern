
public class OreoTopping extends ToppingDecorator {
    public OreoTopping(Cake cake, BakeStrategy bakeStrategy) {
        super(cake, bakeStrategy);
    }

    @Override
    String cakeName() {
        return super.cakeName() + " with topping Oreo";
    }

    @Override
    int cakePrice() {
        return super.cakePrice() + 55;
    }
}
