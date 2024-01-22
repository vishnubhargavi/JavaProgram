package constructor;

public class Main {
    public static void main(String[] args) {
        // Using the constructor with both parameters
        Childclass child1 = new Childclass(5, 10);
        System.out.println("child1 - Parent Variable: " + child1.parentVariable);
        System.out.println("child1 - Child variable: " + child1.childvariable);

        // Using the overloaded constructor with one parameter
        Childclass child2 = new Childclass(15);
        System.out.println("child2 - Parent Variable: " + child2.parentVariable);
        System.out.println("child2 - Child variable: " + child2.childvariable);
    }
}
