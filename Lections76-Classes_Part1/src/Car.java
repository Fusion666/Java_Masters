public class Car {
    private int doors;
    private int wheels;
    private String model;
    private String engine;
    private String color;

    public void setModel(String model) {
        String validModel = model.toLowerCase(); // toLowerCase default method is used to transform any letters into lower case ones
        if(validModel.equals("carrera") || validModel.equals("commodore")) {
            this.model = model;
        }
        else {
            this.model = "Unknown";
        }
    }
    public String getModel() {
        return this.model;
    }
}
