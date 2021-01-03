public class Room {
    private int lamp;
    private int windows;
    private String colorOfWalls;
    private Door door;
    private Sofa sofa;
    private Chairs chairs;
    private Table table;
    private Carpet carpet;
    private SmartTV smartTV;

    public Room(int lamp, int windows, String colorOfWalls, Door door, Sofa sofa, Chairs chairs, Table table,
                Carpet carpet, SmartTV smartTV) {
        this.lamp = lamp;
        this.windows = windows;
        this.colorOfWalls = colorOfWalls;
        this.door = door;
        this.sofa = sofa;
        this.chairs = chairs;
        this.table = table;
        this.carpet = carpet;
        this.smartTV = smartTV;
    }

    public SmartTV getSmartTV() {
        return smartTV;
    }
    public void powerUp() {
        getSmartTV().powerOnTV();
    }
    public void changeChannels() {
        getSmartTV().changeChannels();
    }
}
