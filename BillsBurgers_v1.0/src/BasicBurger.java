public class BasicBurger {
    private String name;
    private String breadRoll;
    private String meat;
    private double price;
    private Additions additions;

    public BasicBurger(String name, String breadRoll, String meat, Additions additions) {
        this.name = name;
        this.breadRoll = breadRoll;
        this.meat = meat;
        this.price = 7.99;
        this.additions = additions;
    }
    public double getPrice() {
        return price + additions.addedPrize();
    }

}
