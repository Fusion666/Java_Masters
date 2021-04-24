import java.util.ArrayList;

public class Album {
    private String nameOfAlbum;
    private String nameOfBand;
    private ArrayList<Song> songsInAlbum;

    public Album(String nameOfAlbum, String nameOfBand) {
        this.nameOfAlbum = nameOfAlbum;
        this.nameOfBand = nameOfBand;
        this.songsInAlbum = new ArrayList<>();
    }


    public ArrayList<Song> getSongsInAlbum() {
        return songsInAlbum;
    }

    public String getNameOfAlbum() {
        return nameOfAlbum;
    }

    public String getNameOfBand() {
        return nameOfBand;
    }

    public void addSongToAlbum(Song song) {
        songsInAlbum.add(song);
    }

    public boolean removeSongFromAlbum(Song song) {
        songsInAlbum.remove(song);
        return true;
    }



    public void printSongsFromAlbum(String nameOfAlbum) {
        System.out.println("Please enter the name of the album which songs you want to see: ");
        System.out.println("The list of songs in \""  + nameOfAlbum + "\"" + " (" + nameOfBand + ")" + " is: " );
        for (int i = 0; i < songsInAlbum.size(); i++) {
            int wholeDuration = songsInAlbum.get(i).getDuration();
            int minutesOfSongRemaining = wholeDuration / 60;
            int secondsOfSongRemaining = wholeDuration % 60;
            System.out.println(songsInAlbum.get(i).getNameOfSong() + " (" + minutesOfSongRemaining +
                    "m " + secondsOfSongRemaining + "s" + ")");
        }
    }
}
