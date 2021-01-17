public class Main {
    public static void main(String[] args) {
        Hamburger hamburger = new Hamburger("basic","beef", 3.99, "white");
        double price = hamburger.itemizeHamburger();
        hamburger.addHamburgerAddition1("Tomato", 0.27);
        hamburger.addHamburgerAddition2("Lettuce",0.75);
        hamburger.addHamburgerAddition3("Cheese", 1.12);

        System.out.println("Total Burger Price is: " + hamburger.itemizeHamburger());

        HealthyBurger healthyBurger = new HealthyBurger("Bacon", 5.67);
        healthyBurger.addHealthyAddition1("Egg", 5.43);
        healthyBurger.addHealthyAddition2("Lentils", 3.41);
        System.out.println("Total Healthy Burger Price is: " + healthyBurger.itemizeHamburger());

        DeluxeBurger db = new DeluxeBurger();
        db.addHamburgerAddition3("should not do this", 50.53);
        db.itemizeHamburger();
    }
}
