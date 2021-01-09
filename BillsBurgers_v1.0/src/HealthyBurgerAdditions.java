public class HealthyBurgerAdditions {
    private boolean redOnion;
    private boolean pinkTomatoes;
    private boolean avocado;
    private boolean coriander;

    public HealthyBurgerAdditions(boolean redOnion, boolean pinkTomatoes, boolean avocado, boolean coriander) {
        this.redOnion = redOnion;
        this.pinkTomatoes = pinkTomatoes;
        this.avocado = avocado;
        this.coriander = coriander;
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
