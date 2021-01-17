public class HealthyBurgerAdditions {
    private boolean redOnion;
    private boolean pinkTomatoes;
    private boolean avocado;
    private boolean coriander;
    private double additionHealthyBurgerPrice = 0.55;


    public HealthyBurgerAdditions(boolean redOnion, boolean pinkTomatoes, boolean avocado, boolean coriander) {
        this.redOnion = redOnion;
        this.pinkTomatoes = pinkTomatoes;
        this.avocado = avocado;
        this.coriander = coriander;
    }

    public double getAdditionHealthyBurgerPrice() {
        return additionHealthyBurgerPrice;
    }

    public boolean isRedOnion() {
        return redOnion;
    }

    public boolean isPinkTomatoes() {
        return pinkTomatoes;
    }

    public boolean isAvocado() {
        return avocado;
    }

    public boolean isCoriander() {
        return coriander;
    }
}
