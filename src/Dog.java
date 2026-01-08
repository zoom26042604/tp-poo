public class Dog extends Animal {
    public Dog(String name, int age) {
        super(name, age);
    }

    @Override
    public void produceSound() {
        System.out.println("Meuuhh");
    }

    public int toHumanYears()  {
        return Animal.toHumanYears(this.age, 7);
    }

    @Override
    public void eat() {
        System.out.println(this.name + " is eating.");
    }
}
