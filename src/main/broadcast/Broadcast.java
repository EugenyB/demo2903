package main.broadcast;

import java.util.Arrays;

public class Broadcast {
    private static int ids = 0;
    private int duration;
    private int id;

    private BroadcastPart[] parts;
    private int count;

    public Broadcast(int duration) {
        this.duration = duration;
        parts = new BroadcastPart[10];
        count = 0;
        id = ++ids;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    public int getId() {
        return id;
    }

    public boolean addPart(BroadcastPart part) {
        if (canAdd(part)) {
            if (count == parts.length) {
                BroadcastPart[] newParts = Arrays.copyOf(parts, parts.length * 2);
                parts = newParts;
            }
            parts[count++] = part;
            return true;
        } else return false;
    }

    private boolean canAdd(BroadcastPart part) {
        int total = 0;
        for (int i = 0; i < count; i++) {
            total += parts[i].getDuration();
        }
        //todo check duration of payable
        return total + part.getDuration() <= getDuration();
    }

    @Override
    public String toString() {
        return "Broadcast{" +
                "duration=" + duration +
                ", id=" + id +
                '}';
    }
}
