import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PrototypeMain {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        ColdDessert cd;

        boolean hasToppings = false;
        String coneFlavor = "";

        System.out.println("Welcome to Art5019's Freezeria, what would you like today?");
        System.out.println("A brazilian (A)çaí, or an milky (I)ce cream?");
        String type = s.nextLine();
        System.out.println("Good choice! What the flavor you want?");
        String flavor = s.nextLine();
        System.out.println("What will be the brand of your choice?");
        String brand = s.nextLine();


        if (type.equals("A")) {

            System.out.println("Will you want some toppings on your Açaí? (Y/N)");
            if (s.nextLine().equals("Y")) {
                hasToppings = true;
            }
            cd = new Acai(brand, hasToppings, flavor);
        } else {
            System.out.println("What cone flavor will you want?");
            coneFlavor = s.nextLine();
            cd = new IceCream(brand, coneFlavor, flavor);
        }


        System.out.println("Wait a minute, our super-duper option generator will show what possibilities" +
                "you can have of your Cold Dessert");
        List<ColdDessert> options = optionGenerator(cd);
        options.forEach(System.out::println);
    }

    public static List<ColdDessert> optionGenerator(ColdDessert base) {
        ArrayList<ColdDessert> options = new ArrayList<>();
        options.add(base);
        options.add(base.clone().pricingChange(Option.CHEAPEST));
        options.add(base.clone().pricingChange(Option.HEAVIEST));
        return options;
    }
}
