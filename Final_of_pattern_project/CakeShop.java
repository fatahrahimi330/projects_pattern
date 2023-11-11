
public class CakeShop {

    public static void main(String[] args) {
        // Singleton Pattern: Get an instance of CakeSingleton
        CakeSingleton cakeSingleton = CakeSingleton.getInstance();

        // Strategy Pattern: Create different baking strategies
        BakeStrategy standardBake = new StandardBake();
        BakeStrategy quickBake = new QuickBake();

        // Observer Pattern: Create an observer
        OrderObserver orderObserver = new OrderNotifier();

        // Decorator Pattern: Create base cakes and decorate them
        Cake baseEgglessCake = new EgglessCake(standardBake);
        Cake decoratedCake1 = new NutsTopping(baseEgglessCake, quickBake);

        Cake baseChocolateCake = new ChocolateCake(quickBake);
        Cake decoratedCake2 = new OreoTopping(baseChocolateCake, standardBake);

        // Adapter Pattern: Create adapters for serving cakes
        CakeAdapter egglessCakeAdapter = new CakeAdapterImpl(decoratedCake1);
        CakeAdapter chocolateCakeAdapter = new CakeAdapterImpl(decoratedCake2);

        // Factory Method Pattern: Create a factory and order cakes
        CakeFactory cakeFactory = new SimpleCakeFactory();

        // Singleton Pattern: Using CakeSingleton instance
        CakeSingleton cakeSingletonInstance = CakeSingleton.getInstance();
        System.out.println("Is cakeSingleton the same instance as cakeSingletonInstance? " +
                (cakeSingleton == cakeSingletonInstance));

        // Factory Method Pattern: Order cakes using the factory
        Cake orderedEgglessCake = cakeFactory.orderCake("eggless", 2, standardBake, orderObserver);
        Cake orderedChocolateCake = cakeFactory.orderCake("chocolate", 1, quickBake, orderObserver);

        // Use the adapters to serve cakes
        egglessCakeAdapter.serve();
        chocolateCakeAdapter.serve();

        // Display information about ordered cakes
        System.out.println("Ordered Eggless Cake: " + orderedEgglessCake.cakeName());
        System.out.println("Ordered Chocolate Cake: " + orderedChocolateCake.cakeName());
    }
}
