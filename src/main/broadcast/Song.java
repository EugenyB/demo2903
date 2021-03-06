package main.broadcast;

public class Song extends BroadcastPart {

    private String title;
    private String singer;

    public Song(int duration, String title, String singer) {
        super(duration);
        this.title = title;
        this.singer = singer;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getSinger() {
        return singer;
    }

    public void setSinger(String singer) {
        this.singer = singer;
    }
}
