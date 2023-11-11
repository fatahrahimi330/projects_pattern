// Cake Class with Template Method Pattern
abstract class Cake {
    private BakeStrategy bakeStrategy;
    private OrderObserver orderObserver;

    public Cake(BakeStrategy bakeStrategy) {
        this.bakeStrategy = bakeStrategy;
    }

    public final void templateMethod(int quantity) {
        makeCake(quantity);
        bakeStrategy.bake();
        refrigerate();
        notifyObserver(quantity);
    }

    // Abstract method to be implemented by subclasses
    public abstract void makeCake(int quantity);

    public void refrigerate() {
        System.out.println("Refrigerating");
    }

    abstract String cakeName();

    abstract int cakePrice();

    // Observer Pattern: Attach an observer to the cake
    public void addObserver(OrderObserver observer) {
        this.orderObserver = observer;
    }

    // Observer Pattern: Notify the observer about the order
    private void notifyObserver(int quantity) {
        if (orderObserver != null) {
            orderObserver.update(quantity, cakeName());
        }
    }
}

class EgglessCake extends Cake {
    public EgglessCake(BakeStrategy bakeStrategy) {
        super(bakeStrategy);
    }

    @Override
    public void makeCake(int quantity) {
        System.out.println("Making Eggless Cake for quantity: " + quantity);
    }

    @Override
    String cakeName() {
        return "Eggless Cake";
    }

    @Override
    int cakePrice() {
        return 50;
    }
}

class ChocolateCake extends Cake {
    public ChocolateCake(BakeStrategy bakeStrategy) {
        super(bakeStrategy);
    }

    @Override
    public void makeCake(int quantity) {
        System.out.println("Making Chocolate Cake for quantity: " + quantity);
    }

    @Override
    String cakeName() {
        return "Chocolate Cake";
    }

    @Override
    int cakePrice() {
        return 100;
    }
}

class EggCake extends Cake {
    public EggCake(BakeStrategy bakeStrategy) {
        super(bakeStrategy);
    }

    @Override
    public void makeCake(int quantity) {
        System.out.println("Making Egg Cake for quantity: " + quantity);
    }

    @Override
    String cakeName() {
        return "Egg Cake";
    }

    @Override
    int cakePrice() {
        return 70;
    }
}