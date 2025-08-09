public class ReportGeneratingVisitor implements Visitor{

    /*Visitor is used when children of a class inherit a method, but manually adding them to each
    class would go against SRP, which would create class coupling, increase it's reading time and
    could create unexpected problems in the future.*/

    @Override
    public void visitParrot(Parrot parrot) {
        System.out.println("The parrot of name " + parrot.getName() + " of age " + parrot.getAge() + "" +
                " suffers with " + parrot.getProblem());
    }

    @Override
    public void visitDog(Dog dog) {
        System.out.println("The dog of name " + dog.getName() + " of age " + dog.getAge() + "" +
                " suffers with " + dog.getProblem());
    }

    @Override
    public void visitCat(Cat cat) {
        System.out.println("The cat of name " + cat.getName() + " of age " + cat.getAge() + "" +
                " suffers with " + cat.getProblem());
    }
}
