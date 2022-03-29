package main.broadcast;

public class Advertising extends BroadcastPart implements Payable {
    private final String product;

    public Advertising(int duration, String product) {
        super(duration);
        this.product = product;
    }

    public String getProduct() {
        return product;
    }

    @Override
    public int cost() {
        return getDuration() * 5;
    }
}
