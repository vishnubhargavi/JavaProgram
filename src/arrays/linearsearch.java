package arrays;

import java.util.Arrays;

public class linearsearch {
    public static void main(String[] args) {
        // Sample array
        int[] numbers = {3, 7, 1, 9, 4, 2, 6};

        System.out.println("Array: " + Arrays.toString(numbers));

        // Element to search
        int target = 4;

        // Perform Linear Search
        int index = linearSearch(numbers, target);

        if (index != -1) {
            System.out.println("Element " + target + " found at index " + index);
        } else {
            System.out.println("Element " + target + " not found in the array");
        }
    }

    // Function to perform Linear Search on an array
    private static int linearSearch(int[] arr, int target) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                return i; // Element found
            }
        }
        return -1; // Element not found
    }
}

