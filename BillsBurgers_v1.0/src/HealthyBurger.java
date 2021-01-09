public class HealthyBurger extends BasicBurger {
    private HealthyBurgerAdditions healthyBurgerAdditions;

    public HealthyBurger(String name, String breadRoll, String meat,
                         HealthyBurgerAdditions healthyBurgerAdditions) {
        super(name,breadRoll,meat,null);
        this.healthyBurgerAdditions = healthyBurgerAdditions;
    }

    @Override
    public double addedPrize() {
        double addedPrize = 0;
        double additionalPrice = 0.55;
        int maxAdditions = 0;

        if(healthyBurgerAdditions.isRedOnion()) {
            maxAdditions++;
            addedPrize += additionalPrice;
        }
        if(healthyBurgerAdditions.isPinkTomatoes()) {
            maxAdditions++;
            addedPrize += additionalPrice;
        }
        if(healthyBurgerAdditions.isAvocado()) {
            maxAdditions++;
            addedPrize += additionalPrice;
            if(maxAdditions > 3) {
                return addedPrize;
            }
        }
        if(healthyBurgerAdditions.isCoriander()) {
            maxAdditions++;
            addedPrize += additionalPrice;
            if(maxAdditions > 3) {
                return addedPrize;
            }
        }
        return addedPrize;
    }
}
