//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

public class BasicBurger {
    private String name = "standard";
    private String breadRoll = "white bread roll";
    private String meat;
    private double price;
    private Additions additions;

    public BasicBurger(String name, String breadRoll, String meat, Additions additions) {
        this.meat = meat;
        this.price = 7.99D;
        this.additions = additions;
    }

    public String getName() {
        return this.name;
    }

    public String getBreadRoll() {
        return this.breadRoll;
    }

    public double getBasicPrice() {
        return this.price;
    }

    public double addedPrize() {
        double addedPrize = 0.0D;
        double additionalPrice = this.additions.getAdditionPrice();
        int maxAdditions = 0;
        if (this.additions.isLettuce()) {
            ++maxAdditions;
            addedPrize += additionalPrice;
        }

        if (this.additions.isTomato()) {
            ++maxAdditions;
            addedPrize += additionalPrice;
        }

        if (this.additions.isPotatoes()) {
            ++maxAdditions;
            addedPrize += additionalPrice;
        }

        if (this.additions.isOnion()) {
            ++maxAdditions;
            addedPrize += additionalPrice;
        }

        if (this.additions.isOlives()) {
            ++maxAdditions;
            addedPrize += additionalPrice;
            if (maxAdditions > 4) {
                return 0.0D;
            }
        }

        if (this.additions.isCarrot()) {
            ++maxAdditions;
            addedPrize += additionalPrice;
            if (maxAdditions > 4) {
                return 0.0D;
            }
        }

        if (this.additions.isCheese()) {
            ++maxAdditions;
            addedPrize += additionalPrice;
            if (maxAdditions > 4) {
                return 0.0D;
            }
        }

        return addedPrize;
    }

    public double getPrice() {
        return this.price + this.addedPrize();
    }

    public void priceSummary() {
        System.out.println("\n \nBASIC BURGER PRICE SUMMARY");
        System.out.println("The base price for the burger is: " + this.price);
        int counterAdditions = 0;
        if (counterAdditions < 5) {
            if (this.additions.isLettuce()) {
                ++counterAdditions;
                System.out.println("lettuce price: " + this.additions.getAdditionPrice());
            }

            if (this.additions.isTomato()) {
                ++counterAdditions;
                System.out.println("tomato price: " + this.additions.getAdditionPrice());
            }

            if (this.additions.isPotatoes()) {
                ++counterAdditions;
                System.out.println("potatoes price: " + this.additions.getAdditionPrice());
            }

            if (this.additions.isOnion()) {
                ++counterAdditions;
                System.out.println("onion price: " + this.additions.getAdditionPrice());
            }

            if (this.additions.isOlives()) {
                ++counterAdditions;
                if (counterAdditions >= 5) {
                    System.out.println("Oops - we are sorry but you can not choose more than 4 additions");
                    return;
                }

                System.out.println("olives price: " + this.additions.getAdditionPrice());
            }

            if (this.additions.isCarrot()) {
                ++counterAdditions;
                if (counterAdditions >= 5) {
                    System.out.println("Oops!!! We are sorry but you can not choose more than 4 additions");
                    return;
                }

                System.out.println("carrot price: " + this.additions.getAdditionPrice());
            }

            if (this.additions.isCheese()) {
                ++counterAdditions;
                if (counterAdditions >= 5) {
                    System.out.println("Oops!!! We are sorry but you can not choose more than 4 additions");
                    return;
                }

                System.out.println("cheese price: " + this.additions.getAdditionPrice());
            }

            System.out.println("The TOTAL PRICE IS: " + this.getPrice());
        }

    }
}
