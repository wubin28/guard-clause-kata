package kata.guard;

public class Order {
    public void submit(Takeout takeout) {
        if (takeout.address() == null) {
            throw new IllegalArgumentException("Address should not be null.");
        }
        if ("".equals(takeout.address())) {
            throw new IllegalArgumentException("Address should not be empty.");
        }
        if (takeout.receiverName() == null) {
            throw new IllegalArgumentException("Receiver name should not be null.");
        }
        if ("".equals(takeout.receiverName())) {
            throw new IllegalArgumentException("Receiver name should not be empty.");
        }
        // submit order
    }
}
