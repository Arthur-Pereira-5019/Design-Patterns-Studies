public class Popsicle implements ColdDesserts{
    private String name;
    private float price;
    private String brand;
    private int calories;
    private int weight;

    public Popsicle(String name, float price, String brand, int calories, int weight) {
        this.name = name;
        this.price = price;
        this.brand = brand;
        this.calories = calories;
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "Popsicle{" +
                "name='" + name + '\'' +
                ", price=" + price +
                ", brand='" + brand + '\'' +
                ", calories=" + calories +
                ", weight=" + weight +
                '}';
    }
}
