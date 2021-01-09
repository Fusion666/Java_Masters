public class Additions {
    private boolean lettuce;
    private boolean tomato;
    private boolean potatoes;
    private boolean onion;
    private boolean olives;
    private boolean carrot;
    private boolean cheese;


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

    public boolean isLettuce() {
        return lettuce;
    }

    public boolean isTomato() {
        return tomato;
    }

    public boolean isPotatoes() {
        return potatoes;
    }

    public boolean isOnion() {
        return onion;
    }

    public boolean isOlives() {
        return olives;
    }

    public boolean isCarrot() {
        return carrot;
    }

    public boolean isCheese() {
        return cheese;
    }
}
