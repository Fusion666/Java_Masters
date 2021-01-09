public class BasicBurger {
    private String name;
    private String breadRoll;
    private String meat;
    private double price;
    private Additions additions;

    public BasicBurger(String name, String breadRoll, String meat, Additions additions) {
        this.name = name;
        this.breadRoll = breadRoll;
        this.meat = meat;
        this.price = 7.99;
        this.additions = additions;
    }
    
    /*
    The method under is calculating the price of the additions
     */
    public double addedPrize() {
        double addedPrize = 0;
        double additionalPrice = 0.55;
        int maxAdditions = 0;
        if(additions.isLettuce()) {
            maxAdditions++;
            addedPrize += additionalPrice;
        }
        if(additions.isTomato()) {
            maxAdditions++;
            addedPrize += additionalPrice;
        }
        if(additions.isPotatoes()) {
            maxAdditions++;
            addedPrize += additionalPrice;
        }
        if(additions.isOnion()) {
            maxAdditions++;
            addedPrize += additionalPrice;
            if(maxAdditions > 3) {
                return addedPrize;
            }
        }
        if(additions.isOlives()) {
            maxAdditions++;
            addedPrize += additionalPrice;
            if(maxAdditions > 3) {
                return addedPrize;
            }
        }
        if(additions.isCarrot()) {
            maxAdditions++;
            addedPrize += additionalPrice;
            if(maxAdditions > 3) {
                return addedPrize;
            }
        }
        if(additions.isCheese()) {
            maxAdditions++;
            addedPrize += additionalPrice;
            if(maxAdditions > 3) {
                return addedPrize;
            }
        }
        return addedPrize;
    }

    /*
    The method getPrice() is calculating the price of the whole burger
     */
    public double getPrice() {
        return price + addedPrize();
    }

}
