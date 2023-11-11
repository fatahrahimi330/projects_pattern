
public class CakeSingleton {
    private static CakeSingleton instance;

    private CakeSingleton() {
    }

    public static CakeSingleton getInstance() {
        if (instance == null) {
            instance = new CakeSingleton();
        }
        return instance;
    }
}
