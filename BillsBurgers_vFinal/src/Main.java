public class Main {
    public class Main {
        public static void main(String[] args) {
            BasicBurger basicBurger = new BasicBurger("standard", "white bread roll", "beef",
                    new Additions(true,true,true,true,
                            true,true,true));
            System.out.println("The total price of the Basic Burger is: " + basicBurger.getPrice()+ "\n");
            BasicBurger basicBurger = new BasicBurger("", "", "beef",
                    new Additions(true,true,false,false,
                            false,false,false));

            HealthyBurger healthyBurger = new HealthyBurger("","", "turkey",
                    new HealthyBurgerAdditions(false, false, false, true));

            DeluxeBurger deluxeBurger = new DeluxeBurger("beef", new AdditionalDeluxeChips(true,false,
                    false,false),new AdditionalDeluxeDrinks(true, false, false,
                    false));


            HealthyBurger healthyBurger = new HealthyBurger("HealthyBurg", "Brown bread row", "turkey",
                    new HealthyBurgerAdditions(false, false, true, true));
//        System.out.println(healthyBurger.getBreadRoll());
//        System.out.println(basicBurger.getBreadRoll());
//          System.out.println(deluxeBurger.getBreadRoll());

            System.out.println("The total price of the Healthy Burger is: " + healthyBurger.getPrice() + "\n");
            System.out.println(deluxeBurger.addedPrize());

            basicBurger.priceSummary();
            healthyBurger.priceSummary();
            deluxeBurger.priceSummary();
        }
    }

}
