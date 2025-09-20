public class IceCream extends ColdDessert{
    public String coneFlavor;


    public IceCream(String brand, String coneFlavor, String flavor) {
        super(9F,brand, 1.2F, 0.7F, 1.3F, 0.8F, 1.5F, flavor);
        this.coneFlavor = coneFlavor;
    }

    @Override
    public ColdDessert clone() {
        return null;
    }

    public IceCream(IceCream ic) {
        super(ic);
        this.coneFlavor = ic.coneFlavor;
    }

    @Override
    public String toString() {
        return "IceCream{" +
                "highWeight=" + highWeight +
                ", lowWeight=" + lowWeight +
                ", priceModifierHigh=" + priceModifierHigh +
                ", priceModifierLow=" + priceModifierLow +
                ", flavor='" + flavor + '\'' +
                ", weight=" + weight +
                ", brand='" + brand + '\'' +
                ", price=" + price +
                ", coneFlavor='" + coneFlavor + '\'' +
                '}';
    }
}
