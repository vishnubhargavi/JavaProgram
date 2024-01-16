package finalprogram;

public class Main1 {
    public static void main(String[] args) {
        // Create an instance of FinalClass
        FinalClass finalInstance = new FinalClass();

        // Access the finalVariable
        System.out.println("final Variable: " + finalInstance.finalVariable);

        // Call the finalMethod
        finalInstance.finalMethod();
    }
}