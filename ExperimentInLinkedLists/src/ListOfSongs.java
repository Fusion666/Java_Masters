import java.util.LinkedList;
import java.util.ListIterator;

public class ListOfSongs {
    private String nameOfList;
    private LinkedList<Song> mySongList;

    public ListOfSongs(String nameOfList) {
        this.nameOfList = nameOfList;
        mySongList = new LinkedList<>();
    }

    public void addSongToSonglist(Song song) {
        mySongList.add(song);

    }

    public void printList() {
        ListIterator<Song> i = mySongList.listIterator();
        while (i.hasNext()) {
            int wholeDuration = i.next().getDuration();
            int minutesOfSongRemaining = wholeDuration / 60;
            int secondsOfSongRemaining = wholeDuration % 60;
            System.out.println("Now listening to: " + i.previous().getNameOfSong() + ": " + minutesOfSongRemaining +
                                "m " + secondsOfSongRemaining + "s ");
            i.next();
        }
    }

}
