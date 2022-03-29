package main.radiostation;

import main.broadcast.Broadcast;

import java.util.Arrays;

public class RadioStation {

    private Broadcast[] broadcasts = new Broadcast[10];
    private int count = 0;

    public void addBroadcast(Broadcast broadcast) {
        if (count == broadcasts.length) {
            Broadcast[] newBroadcasts = Arrays.copyOf(broadcasts, broadcasts.length*2);
            broadcasts = newBroadcasts;
        }
        broadcasts[count++] = broadcast;
    }


    public Broadcast[] getAllBroadcasts() {
        return Arrays.copyOf(broadcasts, count);
    }
}
