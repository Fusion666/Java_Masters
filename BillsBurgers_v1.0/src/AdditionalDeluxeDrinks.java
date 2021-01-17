public class AdditionalDeluxeDrinks {
    private boolean isCocaCola;
    private boolean isPepsi;
    private boolean isFanta;
    private boolean isSprite;

    private double priceCocaCola = 1.99;
    private double pricePepsi = 1.99;
    private double priceFanta = 2.99;
    private double priceSprite = 2.98;

    public AdditionalDeluxeDrinks(boolean isCocaCola, boolean isPepsi, boolean isFanta, boolean isSprite) {
        this.isCocaCola = isCocaCola;
        this.isPepsi = isPepsi;
        this.isFanta = isFanta;
        this.isSprite = isSprite;
    }

    public double getPriceCocaCola() {
        return priceCocaCola;
    }

    public double getPricePepsi() {
        return pricePepsi;
    }

    public double getPriceFanta() {
        return priceFanta;
    }

    public double getPriceSprite() {
        return priceSprite;
    }

    public boolean isCocaCola() {
        return isCocaCola;
    }

    public boolean isPepsi() {
        return isPepsi;
    }

    public boolean isFanta() {
        return isFanta;
    }

    public boolean isSprite() {
        return isSprite;
    }
}
