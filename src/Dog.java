public class Dog extends Animal implements Pet  {
    public Dog(String name, int age) {
        super(name, age);
    }

    @Override
    public void produceSound() {
        System.out.println("Woof Woof");
    }

    public int toHumanYears()  {
        return Animal.toHumanYears(this.age, 7);
    }

    public void eat() {
        System.out.println(this.getName() + " is eating.");
    }

    @Override
    public void play() {
        System.out.println(this.getName() + " is playing.");
    }
}
