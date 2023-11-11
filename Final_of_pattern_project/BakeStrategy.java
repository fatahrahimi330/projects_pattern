// Strategy Pattern
interface BakeStrategy {
    void bake();
}

class StandardBake implements BakeStrategy {
    @Override
    public void bake() {
        // Default baking strategy
        System.out.println("Baking for standard time");
    }
}

class QuickBake implements BakeStrategy {
    @Override
    public void bake() {
        // Quick baking strategy
        System.out.println("Baking quickly");
    }
}