package main.broadcast;

public abstract class BroadcastPart {
    private int duration;

    public BroadcastPart(int duration) {
        this.duration = duration;
    }

    public int getDuration() {
        return duration;
    }

}
