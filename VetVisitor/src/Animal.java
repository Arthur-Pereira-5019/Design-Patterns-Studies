public abstract class Animal {
    private String name;
    private int age;

    public String getProblem() {
        return problem;
    }

    public void setProblem(String problem) {
        this.problem = problem;
    }

    private String problem;

    public Animal(String name, int age, String problem) {
        this.name = name;
        this.age = age;
        this.problem = problem;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    /*Each of its children will pass a Visitor "service" which they will accept the "visit",
    by passing theirselves as a paramater, then the Visitor will analyze who are they visiting
    and based on that, do something different according to who it visited.*/
    public abstract void accept(Visitor visitor);


}
