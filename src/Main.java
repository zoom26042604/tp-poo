//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[]  args) {
        Cow cow = new Cow("Bessie", 4);
        System.out.println("Name: " + cow.getName());
        cow.produceSound();
        System.out.println("Human Age: " + cow.toHumanYears());
    }
}
