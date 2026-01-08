//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[]  args) {
        Cow cow = new Cow("Ylan", 4);
        System.out.println("Name: " + cow.getName());
        cow.produceSound();
        System.out.println("Human Age: " + cow.toHumanYears());

        Dog dog = new Dog("Loic", 19);
        System.out.println("Name: " + dog.getName());
        dog.produceSound();
        System.out.println("Human Age: " + dog.toHumanYears());

        cow.eat();
        dog.eat();
    }
}