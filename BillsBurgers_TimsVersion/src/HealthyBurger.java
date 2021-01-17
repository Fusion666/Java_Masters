public class HealthyBurger extends Hamburger{
    private String healthyExtra1Name;
    private double healthyExtra1Price;

    private String healthyExtra2Name;
    private double healthyExtra2Price;

    public HealthyBurger(String meat, double price) {
        super("Healthy", meat, price, "brown rye roll");
    }

    public void addHealthyAddition1(String name, double healthyExtra1Price) {
        this.healthyExtra1Name = name;
        this.healthyExtra1Price = healthyExtra1Price;
    }
    public void addHealthyAddition2(String name, double healthyExtra2Price) {
        this.healthyExtra2Name = name;
        this.healthyExtra2Price = healthyExtra2Price;
    }

    @Override
    public double itemizeHamburger() {
       double hamburgerPrice = super.itemizeHamburger();
        if (this.healthyExtra1Name != null) {
            hamburgerPrice += this.healthyExtra1Price;
            System.out.println("Added " + this.healthyExtra1Name + " for an extra " + this.healthyExtra1Price);
        }
        if (this.healthyExtra2Name != null) {
            hamburgerPrice += this.healthyExtra2Price;
            System.out.println("Added " + this.healthyExtra2Name + " for an extra " + this.healthyExtra2Price);
        }
        return hamburgerPrice;
    }
}
