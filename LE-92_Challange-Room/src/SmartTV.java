public class SmartTV {
    private String manufacturer;
    private String model;
    private int widthTV;
    private int lengthTV;
    private DVD_Player dvd_player; // object composition

    public SmartTV(String manufacturer, String model, int widthTV, int lengthTV, DVD_Player dvd_player) {
        this.manufacturer = manufacturer;
        this.model = model;
        this.widthTV = widthTV;
        this.lengthTV = lengthTV;
        this.dvd_player = dvd_player;
    }

    public void powerOnTV() {
        System.out.println("TV on.");
    }
    public void changeChannels() {
        System.out.println("Channel changed.");
    }
    public void dvdTurnOn () {
        dvd_player.powerOnDvd();
        dvd_player.insertDisc();
    }
    public void playDvD() {
        dvd_player.playDisk();
    }


    public String getManufacturer() {
        return manufacturer;
    }

    public String getModel() {
        return model;
    }

    public int getWidthTV() {
        return widthTV;
    }

    public int getLengthTV() {
        return lengthTV;
    }

    public DVD_Player getDvd_player() {
        return dvd_player;
    }
}
