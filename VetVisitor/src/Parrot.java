public class Parrot extends Animal{
    public Parrot(String name, int age, String problem) {
        super(name, age, problem);
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visitParrot(this);
    }
}
