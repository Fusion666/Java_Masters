public class DeluxeBurger extends BasicBurger{
    private AdditionalDeluxeChips additionalDeluxeChips;
    private AdditionalDeluxeDrinks additionalDeluxeDrinks;

    public DeluxeBurger(String meat, AdditionalDeluxeChips additionalDeluxeChips,
                        AdditionalDeluxeDrinks additionalDeluxeDrinks) {
        super("Deluxe Burger", "white bred roll", meat, null);
        this.additionalDeluxeChips = additionalDeluxeChips;
        this.additionalDeluxeDrinks = additionalDeluxeDrinks;
    }

    /*
    addedPrize() method overrides the method from the parent class - BasicBurger - this time the method takes into account
    the difference in the prices of each consumable
     */
    @Override
    public double addedPrize() {
        double addedPrize = 0;
        int maxAdditionsDeluxeChips = 0;
        int maxAdditionsDeluxeDrinks = 0;
        if(additionalDeluxeChips.isLays()) {
            maxAdditionsDeluxeChips++;
            addedPrize += additionalDeluxeChips.getPriceLays();
        }
        if(additionalDeluxeChips.isChioChips()) {
            maxAdditionsDeluxeChips++;
            addedPrize += additionalDeluxeChips.getPriceChioChips();
            if(maxAdditionsDeluxeChips > 1) {
                return 0;
            }
        }
        if(additionalDeluxeChips.isRaffles()) {
            maxAdditionsDeluxeChips++;
            addedPrize += additionalDeluxeChips.getPriceRaffles();
            if(maxAdditionsDeluxeChips > 1) {
                return 0;
            }
        }
        if(additionalDeluxeChips.isMrPringles()) {
            maxAdditionsDeluxeChips++;
            addedPrize += additionalDeluxeChips.getPriceMrPringles();
            if(maxAdditionsDeluxeChips > 1) {
                return 0;
            }
        }
        if (additionalDeluxeDrinks.isCocaCola()) {
            maxAdditionsDeluxeDrinks++;
            addedPrize += additionalDeluxeDrinks.getPriceCocaCola();
        }
        if (additionalDeluxeDrinks.isPepsi()) {
            maxAdditionsDeluxeDrinks++;
            addedPrize = additionalDeluxeDrinks.getPricePepsi();
            if (maxAdditionsDeluxeDrinks > 1) {
                return 0;
            }
        }
        if (additionalDeluxeDrinks.isFanta()) {
            maxAdditionsDeluxeDrinks++;
            addedPrize += additionalDeluxeDrinks.getPriceFanta();
            if (maxAdditionsDeluxeDrinks > 1) {
                return 0;
            }
        }
        if (additionalDeluxeDrinks.isSprite()) {
            maxAdditionsDeluxeDrinks++;
            addedPrize += additionalDeluxeDrinks.getPriceSprite();
            if (maxAdditionsDeluxeDrinks > 1) {
                return 0;
            }
        }
        return addedPrize;
    }
    /*
    priceSummary method overrides the method from the parent class. Here the method will check which kind of chips
    and drinks the use has selected and then it will print the following:
        1. The price for the basic Burger
        2. The price for the selected addition
        3. The TOTAL PRICE
     */

    @Override
    public void priceSummary() {
        System.out.println("\n \nDELUXE BURGER PRICE SUMMARY");
        System.out.println(" \nThe base price for the burger is: " + getBasicPrice());
        for(int counterAdditions = 0; counterAdditions < 2;) {
            if(additionalDeluxeChips.isLays()) {
                counterAdditions++;
                System.out.println("Lays chips price: " + additionalDeluxeChips.getPriceLays());
            }
            if(additionalDeluxeChips.isChioChips()) {
                counterAdditions++;
                if(counterAdditions < 2) {
                    System.out.println("Chio chips price: " + additionalDeluxeChips.getPriceChioChips());
                }
                else {
                    System.out.println("Oops - we are sorry but you can not choose more than 1 additional chips");
                    break;
                }
            }
            if(additionalDeluxeChips.isRaffles()) {
                counterAdditions++;
                if(counterAdditions < 2) {
                    System.out.println("Raffles chips price: " + additionalDeluxeChips.getPriceRaffles());
                }
                else {
                    System.out.println("Oops - we are sorry but you can not choose more than 1 additional chips");
                    break;
                }
            }
            if(additionalDeluxeChips.isMrPringles()) {
                counterAdditions++;
                if(counterAdditions < 2) {
                    System.out.println("Mr. Pringles chips price: " + additionalDeluxeChips.getPriceChioChips());
                }
                else {
                    System.out.println("Oops - we are sorry but you can not choose more than 1 additional chips");
                    break;
                }
            }
            for(int counterAdditionsDrinks = 0; counterAdditionsDrinks < 2;){
                if(additionalDeluxeDrinks.isCocaCola()) {
                    counterAdditionsDrinks++;
                    System.out.println("Coca Cola price: " + additionalDeluxeDrinks.getPriceCocaCola());
                }
                if(additionalDeluxeDrinks.isPepsi()) {
                    counterAdditionsDrinks++;
                    if(counterAdditionsDrinks < 2) {
                        System.out.println("Pepsi price: " + additionalDeluxeDrinks.getPricePepsi());
                    }
                    else {
                        System.out.println("Oops - we are sorry but you can not choose more than 1 additional drink");
                        break;
                    }
                }
                if(additionalDeluxeDrinks.isFanta()) {
                    counterAdditionsDrinks++;
                    if(counterAdditionsDrinks < 2) {
                        System.out.println("Fanta price: " + additionalDeluxeDrinks.getPriceFanta());
                    }
                    else {
                        System.out.println("Oops - we are sorry but you can not choose more than 1 additional drink");
                        break;
                    }
                }
                if(additionalDeluxeDrinks.isSprite()) {
                    counterAdditionsDrinks++;
                    if(counterAdditionsDrinks < 2) {
                        System.out.println("Sprite price: " + additionalDeluxeDrinks.getPriceSprite());
                    }
                    else {
                        System.out.println("Oops - we are sorry but you can not choose more than 1 additional drink");
                        break;
                    }
                }
                break;
            }
            System.out.println("The TOTAL PRICE IS: " + getPrice());
            break;
        }
    }
}
