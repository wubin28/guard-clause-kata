package kata.guard;

public class Takeout {
    private String address;
    private String receiverName;

    public Takeout(String address, String receiverName) {
        this.address = address;
        this.receiverName = receiverName;
    }

    public String address() {
        return this.address;
    }

    public String receiverName() {
        return this.receiverName;
    }
}
