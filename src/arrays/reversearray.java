package arrays;

import java.util.Arrays;

public class reversearray {
    public static void main(String[] args) {
        // Sample array
        int[] originalArray = {1, 2, 3, 4, 5};

        System.out.println("Original Array: " + Arrays.toString(originalArray));

        // Reverse the array
        reverseArray(originalArray);

        System.out.println("Reversed Array: " + Arrays.toString(originalArray));
    }

    // Function to reverse the array
    private static void reverseArray(int[] arr) {
        int start = 0;
        int end = arr.length - 1;

        while (start < end) {
            // Swap elements at start and end indices
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;

            // Move indices towards the center
            start++;
            end--;
        }
    }
}

