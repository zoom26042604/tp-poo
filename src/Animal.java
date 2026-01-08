public abstract class Animal {
    private String name;
    protected int age;

    protected Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }

    protected String getName() {
        return name;
    }

    public void produceSound() {
    }

    public static int toHumanYears(int animalYears, int factor) {
        return animalYears * factor;
    }

    public void eat() {}

    public void eat(String food) {
        System.out.println(this.name + " is eating " + food + ".");
    }
}
