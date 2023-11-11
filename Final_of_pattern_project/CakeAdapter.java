// Adapter Pattern
interface CakeAdapter {
    void serve();
}

class CakeAdapterImpl implements CakeAdapter {
    private Cake cake;

    public CakeAdapterImpl(Cake cake) {
        this.cake = cake;
    }

    @Override
    public void serve() {
        System.out.println("Serving " + cake.cakeName());
    }
}