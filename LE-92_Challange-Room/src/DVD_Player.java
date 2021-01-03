public class DVD_Player {
    private String manufacturer;
    private String model;

    public DVD_Player(String manufacturer, String model) {
        this.manufacturer = manufacturer;
        this.model = model;
    }

    public void powerOnDvd() {
        System.out.println(manufacturer + " DVD Player, model: " + model + " turned ON.");
    }
    public void insertDisc() {
        System.out.println("Please insert a disk in the disk slot.");
    }
    public void playDisk() {
        System.out.println("Disk is loading ...");
    }


    public String getManufacturer() {
        return manufacturer;
    }

    public String getModel() {
        return model;
    }
}
