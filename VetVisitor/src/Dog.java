public class Dog extends Animal{
    public Dog(String name, int age, String problem) {
        super(name, age, problem);
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visitDog(this);
    }
}
