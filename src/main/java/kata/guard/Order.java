package kata.guard;

public class Order {
    public void submit(Takeout takeout) {
        if (takeout.address() == null || "".equals(takeout.address())) {
            throw new IllegalArgumentException("Address should not be null and empty.");
        }
        // submit order
    }
}
