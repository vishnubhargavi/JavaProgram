package objectarray;

public class person {
    private double height;
    private double weight;
    private String ssn;
    private String phoneNumber;

    // Constructor
    public person(double height, double weight, String ssn, String phoneNumber) {
        this.height = height;
        this.weight = weight;
        this.ssn = ssn;
        this.phoneNumber = phoneNumber;
    }

    // Getter methods...

    // Override equals method to match persons based on ssn
    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        person person = (person) obj;
        return ssn.equals(person.ssn);
    }

    // Getter methods...

    public double getHeight() {
        return height;
    }

    public double getWeight() {
        return weight;
    }

    public String getSsn() {
        return ssn;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    // Main method for testing
    public static void main(String[] args) {
        // Creating some sample persons
        person person1 = new person(175.0, 70.0, "123-45-6789", "123-456-7890");
        person person2 = new person(160.0, 60.0, "987-65-4321", "987-654-3210");
        person person3 = new person(180.0, 80.0, "123-45-6789", "555-123-4567");

        // Testing the equals method
        boolean result1 = person1.equals(person2);
        boolean result2 = person1.equals(person3);

        // Displaying the results
        System.out.println("Equality check between person1 and person2: " + result1);
        System.out.println("Equality check between person1 and person3: " + result2);
    }
}
