package arrays;

import java.util.Scanner;

public class integerarray {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input the size of the array
        System.out.print("Enter the size of the array: ");
        int size = scanner.nextInt();

        // Input the elements of the array
        int[] array = new int[size];
        System.out.println("Enter the elements of the array:");

        for (int i = 0; i < size; i++) {
            array[i] = scanner.nextInt();
        }

        // Close the scanner to prevent resource leak
        scanner.close();

        // Find the largest and smallest numbers
        int largest = array[0];
        int smallest = array[0];

        for (int i = 1; i < size; i++) {
            if (array[i] > largest) {
                largest = array[i];
            } else if (array[i] < smallest) {
                smallest = array[i];
            }
        }

        // Output the results
        System.out.println("Largest number: " + largest);
        System.out.println("Smallest number: " + smallest);
    }
}
