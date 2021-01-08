public class Additions {
    private boolean lettuce = false;
    private boolean tomato = false;
    private boolean potatoes = false;
    private boolean onion = false;
    private boolean olives = false;
    private boolean carrot = false;
    private boolean cheese = false;


    public Additions(boolean lettuce, boolean tomato, boolean potatoes, boolean onion,
                     boolean olives, boolean carrot, boolean cheese) {
        this.lettuce = lettuce;
        this.tomato = tomato;
        this.potatoes = potatoes;
        this.onion = onion;
        this.olives = olives;
        this.carrot = carrot;
        this.cheese = cheese;

    }

    public double addedPrize() {
        double addedPrize = 0;
        double additionalPrice = 0.55;
        int maxAdditions = 0;
        if(lettuce) {
            maxAdditions++;
            addedPrize += additionalPrice;
        }
        if(tomato) {
            maxAdditions++;
            addedPrize += additionalPrice;
        }
        if(potatoes) {
            maxAdditions++;
            addedPrize += additionalPrice;
        }
        if(onion) {
            maxAdditions++;
            addedPrize += additionalPrice;
            if(maxAdditions > 3) {
                return addedPrize;
            }
        }
        if(olives) {
            maxAdditions++;
            addedPrize += additionalPrice;
            if(maxAdditions > 3) {
                return addedPrize;
            }
        }
        if(carrot) {
            maxAdditions++;
            addedPrize += additionalPrice;
            if(maxAdditions > 3) {
                return addedPrize;
            }
        }
        if(cheese) {
            maxAdditions++;
            addedPrize += additionalPrice;
            if(maxAdditions > 3) {
                return addedPrize;
            }
        }
        return addedPrize;
    }
}
