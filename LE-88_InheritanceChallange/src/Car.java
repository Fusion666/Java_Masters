public class Car extends Vehicle{
    private int numberOfDoors;
    private int numberOfTires;

    public Car(String steering, String changingGears, String moving,int numberOfDoors, int numberOfTiresumberOfTires) {
        super(steering, changingGears, moving);
    }
    public void howItMoves() {
        System.out.println("Moves by wheels");
    }
    public void typeOfTires() {
        System.out.println("have no idea");
    }

    public int getNumberOfDoors() {
        return numberOfDoors;
    }
    public int getNumberOfTires() {
        return numberOfTires;
    }
}
