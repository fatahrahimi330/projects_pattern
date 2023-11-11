// Decorator Pattern
public class ToppingDecorator extends Cake {
    private Cake cake;

    public ToppingDecorator(Cake cake, BakeStrategy bakeStrategy) {
        super(bakeStrategy);
        this.cake = cake;
    }

    @Override
    public void makeCake(int quantity) {
        cake.makeCake(quantity);
    }

    @Override
    String cakeName() {
        return cake.cakeName();
    }

    @Override
    int cakePrice() {
        return cake.cakePrice();
    }
}
