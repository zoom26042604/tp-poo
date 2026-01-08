public class Cow extends Animal {

    public Cow(String name, int age) {
        super(name, age);
    }

    @Override
    public void produceSound() {
        System.out.println("Meuuhh");
    }

    public int toHumanYears()  {
        return Animal.toHumanYears(this.age, 14);
    }
}

