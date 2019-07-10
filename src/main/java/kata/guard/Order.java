package kata.guard;

public class Order {
    public void submit(Takeout takeout) {
        guard(takeout);
        // submit order
    }

    private void guard(Takeout takeout) {
        shouldNotBeNull(takeout.address(), "Address should not be null.");
        shouldNotBeEmpty(takeout.address(), "Address should not be empty.");
        shouldNotBeNull(takeout.receiverName(), "Receiver name should not be null.");
        shouldNotBeEmpty(takeout.receiverName(), "Receiver name should not be empty.");
    }

    private void shouldNotBeEmpty(String address, String errorMessage) {
        if ("".equals(address)) {
            throw new IllegalArgumentException(errorMessage);
        }
    }

    private void shouldNotBeNull(String address, String errorMessage) {
        if (address == null) {
            throw new IllegalArgumentException(errorMessage);
        }
    }
}
