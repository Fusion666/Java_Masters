public class SportsCar extends Car{
    private String typeOfEngine;
    private String typeOfTraction;

    public SportsCar(String steering, String changingGears, String moving,int numberOfDoors, int numberOfTires
                    , String typeOfEngine, String typeOfTraction) {
        super(steering, changingGears, moving,numberOfDoors,numberOfTires );
        this.typeOfEngine = typeOfEngine;
        this.typeOfTraction = typeOfTraction;
    }

    public String getTypeOfEngine() {
        return typeOfEngine;
    }
    public String getTypeOfTraction() {
        return typeOfTraction;
    }

    @Override
    public void howItMoves() {
        System.out.println("Moves by wheels, but faster");
    }

    @Override
    public void typeOfTires() {
        System.out.println("Still have not even the slightest idea");
    }
}


