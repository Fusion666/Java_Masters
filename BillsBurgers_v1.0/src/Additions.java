//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

public class Additions {
    private boolean lettuce;
    private boolean tomato;
    private boolean potatoes;
    private boolean onion;
    private boolean olives;
    private boolean carrot;
    private boolean cheese;
    private double additionPrice = 0.55D;

    public Additions(boolean lettuce, boolean tomato, boolean potatoes, boolean onion, boolean olives, boolean carrot, boolean cheese) {
        this.lettuce = lettuce;
        this.tomato = tomato;
        this.potatoes = potatoes;
        this.onion = onion;
        this.olives = olives;
        this.carrot = carrot;
        this.cheese = cheese;
    }

    public double getAdditionPrice() {
        return this.additionPrice;
    }

    public boolean isLettuce() {
        return this.lettuce;
    }

    public boolean isTomato() {
        return this.tomato;
    }

    public boolean isPotatoes() {
        return this.potatoes;
    }

    public boolean isOnion() {
        return this.onion;
    }

    public boolean isOlives() {
        return this.olives;
    }

    public boolean isCarrot() {
        return this.carrot;
    }

    public boolean isCheese() {
        return this.cheese;
    }
}
