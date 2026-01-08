//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[]  args) {
        System.out.println("Cow:");
        Cow cow = new Cow("Ylan", 4);
        System.out.println("Name: " + cow.getName());
        cow.produceSound();
        System.out.println("Human Age: " + cow.toHumanYears());

        System.out.println("\nDog:");
        Dog dog = new Dog("Loic", 19);
        System.out.println("Name: " + dog.getName());
        dog.produceSound();
        System.out.println("Human Age: " + dog.toHumanYears());

        System.out.println("\nEating:");
        cow.eat();
        dog.eat();

        cow.eat("Grass");
        dog.eat("Dog Food");

        // Don't have access:
        //  System.out.println(cow.name);
        //  System.out.println(dog.name);

        // Have access:
        //  System.out.println("Cow age: " + cow.age);
       //   System.out.println("Dog age: " + dog.age);

    }
}