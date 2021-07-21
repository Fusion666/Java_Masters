public class Gearbox {
    private boolean ClutchIsIn;

    public void operateClutch(String inOrOut) {
        this.ClutchIsIn = inOrOut.equalsIgnoreCase("in");
    }
}
