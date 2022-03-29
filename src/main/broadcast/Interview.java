package main.broadcast;

public class Interview extends BroadcastPart implements Payable {
    private String name;

    public Interview(int duration, String name) {
        super(duration);
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public int cost() {
        return Math.round(getDuration() * 0.5f);
    }
}
