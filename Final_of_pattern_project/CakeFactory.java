// Factory Method Pattern
abstract class CakeFactory {
    public abstract Cake createCake(String type, BakeStrategy bakeStrategy);

    public Cake orderCake(String type, int quantity, BakeStrategy bakeStrategy, OrderObserver orderObserver) {
        Cake cake = createCake(type, bakeStrategy);
        cake.addObserver(orderObserver);
        cake.templateMethod(quantity);
        return cake;
    }
}

class SimpleCakeFactory extends CakeFactory {
    @Override
    public Cake createCake(String type, BakeStrategy bakeStrategy) {
        switch (type) {
            case "eggless":
                return new EgglessCake(bakeStrategy);
            case "chocolate":
                return new ChocolateCake(bakeStrategy);
            // Add more cases for other types of cakes
            default:
                return new EggCake(bakeStrategy);
        }
    }
}