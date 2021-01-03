public class Vehicle {
    private String steering;
    private String changingGears;
    private String moving;

    public Vehicle(String steering, String changingGears,
                   String moving) {

        this.steering = steering;
        this.changingGears = changingGears;
        this.moving = moving;
    }

    public String getSteering() {
        return steering;
    }

    public String getChangingGears() {
        return changingGears;
    }

    public String moving() {
        return moving;
    }
}
