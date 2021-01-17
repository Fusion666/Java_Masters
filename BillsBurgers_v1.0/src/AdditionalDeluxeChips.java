public class AdditionalDeluxeChips {
    private boolean isLays;
    private boolean isChioChips;
    private boolean isRaffles;
    private boolean isMrPringles;

    private double priceLays = 3.99;
    private double priceChioChips = 2.99;
    private double priceRaffles = 4.49;
    private double priceMrPringles = 4.99;

    public AdditionalDeluxeChips(boolean isLays, boolean isChioChips, boolean isRaffles, boolean isMrPringles) {
        this.isLays = isLays;
        this.isChioChips = isChioChips;
        this.isRaffles = isRaffles;
        this.isMrPringles = isMrPringles;
    }

    public double getPriceLays() {
        return priceLays;
    }

    public double getPriceChioChips() {
        return priceChioChips;
    }

    public double getPriceRaffles() {
        return priceRaffles;
    }

    public double getPriceMrPringles() {
        return priceMrPringles;
    }

    public boolean isLays() {
        return isLays;
    }

    public boolean isChioChips() {
        return isChioChips;
    }

    public boolean isRaffles() {
        return isRaffles;
    }

    public boolean isMrPringles() {
        return isMrPringles;
    }
}
