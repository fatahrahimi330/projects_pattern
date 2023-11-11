// Observer Pattern
interface OrderObserver {
    void update(int quantity, String cakeName);
}

class OrderNotifier implements OrderObserver {
    @Override
    public void update(int quantity, String cakeName) {
        System.out.println("Order received for " + quantity + " " + cakeName);
    }
}