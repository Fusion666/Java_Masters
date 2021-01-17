public class HealthyBurger extends BasicBurger {
    private HealthyBurgerAdditions healthyBurgerAdditions;

    public HealthyBurger(String name, String breadRoll, String meat,
                         HealthyBurgerAdditions healthyBurgerAdditions) {
        super("Healthy Burger", "brown rye bread roll",meat,null);
        this.healthyBurgerAdditions = healthyBurgerAdditions;
    }
    @Override //overriding this method from the parent class
    public String getName() {
        return "Deluxe Burger";
    }
    @Override //overriding this method from the parent class
    public String getBreadRoll() {
        return "white rye bread roll";
    }

    @Override //overriding this method from the parent class
    public double addedPrize() {
        double addedPrize = 0;
        double additionalPrice = healthyBurgerAdditions.getAdditionHealthyBurgerPrice();
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
            if(maxAdditions > 2) {
                return addedPrize;
            }
        }
        if(healthyBurgerAdditions.isCoriander()) {
            maxAdditions++;
            addedPrize += additionalPrice;
            if(maxAdditions > 2) {
                return addedPrize;
            }
        }
        return addedPrize;
    }

    @Override //overriding the parent method but this time with fields from HealthyBurgerAdditions class
    public void priceSummary() {
        System.out.println("\n \nHEALTHY BURGER PRICE SUMMARY");
        System.out.println("The base price for the burger is: " + getBasicPrice());

        for(int counterAdditions = 0; counterAdditions < 3;) {
            if(healthyBurgerAdditions.isRedOnion()) {
                counterAdditions++;
                System.out.println("red onion price: " + healthyBurgerAdditions.getAdditionHealthyBurgerPrice());
            }
            if(healthyBurgerAdditions.isPinkTomatoes()) {
                counterAdditions++;
                System.out.println("pink tomato price: " + healthyBurgerAdditions.getAdditionHealthyBurgerPrice());
            }
            if(healthyBurgerAdditions.isAvocado()) {
                counterAdditions++;
                if (counterAdditions < 3) {
                    System.out.println("avocado price: " + healthyBurgerAdditions.getAdditionHealthyBurgerPrice());
                }
                else {
                    System.out.println("Oops - we are sorry but you can not choose more than 4 additions");
                    break;
                }
            }
            if(healthyBurgerAdditions.isCoriander()) {
                counterAdditions++;
                if (counterAdditions < 3) {
                    System.out.println("coriander price: " + healthyBurgerAdditions.getAdditionHealthyBurgerPrice());
                }
                else {
                    System.out.println("Oops!!! We are sorry but you can not choose more than 4 additions");
                    break;
                }
            }
            System.out.println("The TOTAL PRICE IS: " + getPrice());
            break;
        }
    }
}
