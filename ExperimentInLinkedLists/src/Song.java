public class Song {
    private String nameOfSong;
    private int duration;

    public Song(String nameOfSong, int duration) {
        this.nameOfSong = nameOfSong;
        this.duration = duration;
    }

    public String getNameOfSong() {
        return nameOfSong;
    }

    public int getDuration() {
        return duration;
    }
}
