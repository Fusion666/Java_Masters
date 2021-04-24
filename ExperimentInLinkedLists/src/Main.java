public class Main {
    public static void main(String[] args) {
        ListOfSongs myList = new ListOfSongs("Relaxing music");
        myList.addSongToSonglist(new Song("Hero", 214));
        myList.addSongToSonglist(new Song("New Year's Day", 316));
        myList.addSongToSonglist(new Song("Gimme Shelter", 240));
        myList.addSongToSonglist(new Song("Die Young", 302));
        myList.addSongToSonglist(new Song("Tunnel Vision", 365));
        myList.addSongToSonglist(new Song("Fool", 256));
        myList.addSongToSonglist(new Song("Into The Night", 318));

        Album pieceOfMind = new Album("Piece of Mind","Iron Maiden");
        pieceOfMind.addSongToAlbum(new Song("Where Eagles Dare", 370));
        pieceOfMind.addSongToAlbum(new Song("Revelations", 408));
        pieceOfMind.addSongToAlbum(new Song("Die With Your Boots On", 328));
        pieceOfMind.addSongToAlbum(new Song("The Trooper", 250));
        pieceOfMind.addSongToAlbum(new Song("Quest For Fire", 221));
        pieceOfMind.addSongToAlbum(new Song("To Tame A Land", 371));

        AlbumCollection heavyMetal = new AlbumCollection("Heavy metal");
        heavyMetal.addAlbumToCollection(new Album("No Prayer For The Dying", "Iron Maiden"));
        heavyMetal.addSongToExistingAlbum(new Song("The Assassin", 275));
//        heavyMetal.showAlbums();


//        myList.printList();
//    pieceOfMind.printSongsFromAlbum();

    }

}
