public class Main {
    public static void main(String[] args) {
        BasicBurger basicBurger = new BasicBurger("standard", "white bread roll", "beef",
                new Additions(true,true,true,true,
                        true,true,true));
        System.out.println("The total price of the Basic Burger is: " + basicBurger.getPrice()+ "\n");

        HealthyBurger healthyBurger = new HealthyBurger("HealthyBurg", "Brown bread row", "turkey",
                new HealthyBurgerAdditions(false, false, true, true));

        System.out.println("The total price of the Healthy Burger is: " + healthyBurger.getPrice() + "\n");
    }
}
