public abstract class Animal {
    protected String name;
    protected int age;

    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }

public String getName() {
        return name;
    }

    public void produceSound() {}

    public static int toHumanYears(int animalYears, int factor) {
        return animalYears * factor;
    }

    public void eat() {}
}
