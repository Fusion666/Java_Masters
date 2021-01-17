public class DeluxeBurger extends Hamburger{
    @Override
    public void addHamburgerAddition1(String name, double price) {
        System.out.println("Can not add additional items in deluxe burger");
    }

    @Override
    public void addHamburgerAddition2(String name, double price) {
        System.out.println("Can not add additional items in deluxe burger");
    }

    @Override
    public void addHamburgerAddition3(String name, double price) {
        System.out.println("Can not add additional items in deluxe burger");

    }

    @Override
    public void addHamburgerAddition4(String name, double price) {
        System.out.println("Can not add additional items in deluxe burger");
    }

    public DeluxeBurger() {
        super("Deluxe", "Sausage & Bacon", 14.54, "White");
        super.addHamburgerAddition1("Chips", 2.71);
        super.addHamburgerAddition2("Drinks", 1.85);

    }
}
