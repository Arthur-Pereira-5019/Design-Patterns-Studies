public class Prototype {
    public static void main(String[] args) {
        IceCream a = new IceCream("Chocolate",3.5F,"Kibom",500);
        IceCream b = a;
        System.out.println(b.toString());
    }
}
