public class Main {
    public static void main(String [] args) {
        Car wartburg  = new Car("wheel", "byHand", "on the ground",
                4,4);
        SportsCar melkusRS1000 = new SportsCar("wheel","byHand", "on the ground",
                2,4," mid-mounted 3-cylinder 2-stroke 992 cm3 engine",
                "no additionaltracton control");

        wartburg.howItMoves();
        wartburg.typeOfTires();
        melkusRS1000.howItMoves();
        melkusRS1000.typeOfTires();
    }
}
