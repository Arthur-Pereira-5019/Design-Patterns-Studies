public class Acai extends ColdDessert {
    private boolean hasToppings;

    public Acai(String brand, boolean hasToppings, String flavor) {
        super(12.0F,brand, 1.0F, hasToppings ? 1.3F : 1.2F, hasToppings ? 0.9F : 0.8F, 1.3F, 0.9F, flavor);
        this.hasToppings = hasToppings;
    }

    public Acai() {
    }

    public Acai(Acai acai) {
        super(acai);
        this.hasToppings = acai.hasToppings;
    }


    @Override
    public ColdDessert clone() {
        return new Acai(this);
    }

    @Override
    public String toString() {
        return "Acai{" +
                "hasToppings=" + hasToppings +
                ", price=" + price +
                ", brand='" + brand + '\'' +
                ", weight=" + weight +
                ", flavor='" + flavor + '\'' +
                ", priceModifierLow=" + priceModifierLow +
                ", priceModifierHigh=" + priceModifierHigh +
                ", lowWeight=" + lowWeight +
                ", highWeight=" + highWeight +
                '}';
    }
}
