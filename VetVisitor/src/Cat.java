public class Cat extends Animal{
    public Cat(String name, int age, String problem) {
        super(name, age, problem);
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visitCat(this);
    }
}
