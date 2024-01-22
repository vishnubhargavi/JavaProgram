package objectarray;

public class product implements Comparable<product> {
    private double weight;
    private double price;
    private int id;

    // Constructor
    public product(double weight, double price, int id) {
        this.weight = weight;
        this.price = price;
        this.id = id;
    }

    // Getter methods

    public double getWeight() {
        return weight;
    }

    public double getPrice() {
        return price;
    }

    public int getId() {
        return id;
    }

    // Implementing compareTo method for Comparable interface
    @Override
    public int compareTo(product otherProduct) {
        // Compare based on price
        return Double.compare(this.price, otherProduct.price);
    }

    // Main method for testing
    public static void main(String[] args) {
        // Creating some sample products
        product product1 = new product(2.5, 20.0, 1);
        product product2 = new product(1.8, 15.0, 2);
        product product3 = new product(3.0, 25.0, 3);

        // Comparing products based on price
        int result1 = product1.compareTo(product2);
        int result2 = product2.compareTo(product3);

        // Displaying the results
        System.out.println("Comparison result between product1 and product2: " + result1);
        System.out.println("Comparison result between product2 and product3: " + result2);
    }
}

