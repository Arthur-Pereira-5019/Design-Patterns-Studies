import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello, World!");
        Dog dog = new Dog("Antonio",15,"Flea");
        Cat cat = new Cat("Kitty",12,"Purrs way too much");
        Parrot parrot = new Parrot("Jack",4,"Deafness");
        Cat cat2 = new Cat("Lady",6,"Broken Leg");

        ArrayList<Animal> pets = new ArrayList<>();
        pets.add(cat);
        pets.add(dog);
        pets.add(parrot);
        pets.add(cat2);

        ReportGeneratingVisitor reportG = new ReportGeneratingVisitor();
        pets.forEach(p -> p.accept(reportG));

    }
}