package constructor;

public class Childclass extends ParentClass {
    // Instance variable in the child class
    public int childvariable;

    // Constructor for the child class to initialize both instance variables
    public Childclass(int parentVariable, int childvariable) {
        // Call the constructor of the parent class to initialize parentVariable
        super(parentVariable);
        // Initialize the childVariable
        this.childvariable = childvariable;
    }

    public Childclass(int childvariable) {
        // Call the constructor of the parent class with a default value for parentVariable
        super(0);
        // Initialize the childVariable
        this.childvariable = childvariable;
    }
}
