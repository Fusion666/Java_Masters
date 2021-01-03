public class Chairs {
    private String type;
    private String materialOfTheChair;
    private int numberOfChairs;

    public Chairs(String type, String materialOfTheChair, int numberOfChairs) {
        this.type = type;
        this.materialOfTheChair = materialOfTheChair;
        this.numberOfChairs = numberOfChairs;
    }

    public String getType() {
        return type;
    }

    public String getMaterialOfTheChair() {
        return materialOfTheChair;
    }

    public int getNumberOfChairs() {
        return numberOfChairs;
    }
}
