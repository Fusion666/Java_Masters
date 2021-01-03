public class Main {
    public static void main(String[] args) {
        Door door = new Door("brown", "wood");

        Sofa sofa = new Sofa("3-seater", "blue", "240x100x100");

        Chairs chairs = new Chairs("someOrdinaryChair", "wood", 4);

        Table table = new Table("Round Table", "wood - mahagony", 1);

        Carpet carpet = new Carpet("white", "textil", 200, 150);

        DVD_Player dvd_player = new DVD_Player("Philips", "ac150");

        SmartTV smartTV = new SmartTV("Sony", "B2400", 150, 250, dvd_player);

        Room room = new Room(1, 2, "orange", door, sofa, chairs, table, carpet, smartTV);

        room.powerUp();
        room.changeChannels();
        room.getSmartTV().dvdTurnOn();
    }
}
