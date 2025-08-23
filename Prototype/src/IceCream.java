public class IceCream {
    private String name;
    private float price;
    private String brand;
    private int calories;
    private boolean madeWithJuice;

    public IceCream(String name, float price, String brand, int calories) {
        this.name = name;
        this.price = price;
        this.brand = brand;
        this.calories = calories;
    }

    @Override
    public String toString() {
        return "IceCream{" +
                "name='" + name + '\'' +
                ", price=" + price +
                ", brand='" + brand + '\'' +
                ", calories=" + calories +
                '}';
    }
}
