public abstract class ColdDessert {
    public float price;
    public String brand;
    public float weight;
    public String flavor;

    public float priceModifierLow;
    public float priceModifierHigh;

    public float lowWeight;
    public float highWeight;

    public ColdDessert(float price, String brand, float weight, float priceModifierLow, float priceModifierHigh, float lowWeight, float highWeight, String flavor) {
        this.price = price;
        this.brand = brand;
        this.weight = weight;
        this.priceModifierLow = priceModifierLow;
        this.priceModifierHigh = priceModifierHigh;
        this.lowWeight = lowWeight;
        this.highWeight = highWeight;
    }

    public ColdDessert(ColdDessert cd) {
        this.price = cd.price;
        this.brand = cd.brand;
        this.weight = cd.weight;
        this.priceModifierLow = cd.priceModifierLow;
        this.priceModifierHigh = cd.priceModifierHigh;
        this.lowWeight = cd.lowWeight;
        this.highWeight = cd.highWeight;
    }

    public ColdDessert() {
    }

    public ColdDessert pricingChange(Option o) {
        switch (o) {
            case HEAVIEST:
                price *= priceModifierLow;
                weight *= highWeight;
            case CHEAPEST:
                price *= priceModifierHigh;
                weight *= lowWeight;
        }
        return this;
    }

    public abstract ColdDessert clone();


}
