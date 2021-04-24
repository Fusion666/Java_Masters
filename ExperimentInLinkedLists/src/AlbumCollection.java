import java.util.ArrayList;
import java.util.Scanner;

public class AlbumCollection {
    private String genre;
    private ArrayList<Album> albumList;

    public AlbumCollection(String genre) {
        this.genre = genre;
        this.albumList = new ArrayList<>();
    }


    private boolean existingAlbum(Album album) {
        int comparison = -1;
        for (int i = 0; i < albumList.size(); i++) {
            comparison = albumList.get(i).getNameOfAlbum().compareTo(album.getNameOfAlbum());
        }
        if (comparison == 0) {
            return true;
        }
        return false;
    }
    private boolean existingAlbum(String nameOfAlbum) {
        int comparison = -1;
        for (int i = 0; i < albumList.size(); i++) {
            comparison = albumList.get(i).getNameOfAlbum().compareTo(nameOfAlbum);
        }
        if (comparison == 0) {
            return true;
        }
        return false;
    }

    public void addAlbumToCollection(Album album) {
        if (!existingAlbum(album)) {
            albumList.add(album);
            System.out.println("Album: " + album.getNameOfAlbum() + " added");
        }

        System.out.println("Album not added.");
    }

    private boolean existingSong(String nameOfSong) {
        int comparison = -1;
        for (int i = 0; i < albumList.size(); i++) {
            comparison = albumList.get(i).getSongsInAlbum().get(i).getNameOfSong().compareTo(nameOfSong);
        }
        return comparison == 0;
    }

    public void addSongToExistingAlbum(Song song) {
        System.out.println("Enter new song: ");
        if (!existingSong(song.getNameOfSong())) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter the name of the album you would like to have the song added in: ");
            String nameOfAlbum = scanner.next();
            scanner.nextLine();
            if (existingAlbum(nameOfAlbum)) {
                for (int i = 0; i < albumList.size(); i++) {
                    if (albumList.get(i).getNameOfAlbum().compareTo(nameOfAlbum) == 0) {
                        albumList.get(i).addSongToAlbum(song);
                    }
                }
            }
        }
    }

    public void showAlbums() {
        System.out.println("Owned Albums: ");
        for (int i = 0; i < albumList.size(); i++) {
            System.out.println(albumList.get(i).getNameOfAlbum() + albumList.get(i).getNameOfBand());
        }
    }


}
