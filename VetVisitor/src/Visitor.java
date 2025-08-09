public interface Visitor {

    /*Defines the types of visits our visitor will do. It also opens possibility for creating
    * multiple visitors that do different stuff.*/

    void visitParrot(Parrot parrot);
    void visitDog(Dog dog);
    void visitCat(Cat cat);

}
