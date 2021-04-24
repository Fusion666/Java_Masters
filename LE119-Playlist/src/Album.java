import java.util.ArrayList;

public class Album {
    private ArrayList<Song> songsInAlbum;

    public Album(ArrayList<Song> songsInAlbum) {
        this.songsInAlbum = songsInAlbum;
    }

    public ArrayList<Song> getSongsInAlbum() {
        return songsInAlbum;
    }
}
