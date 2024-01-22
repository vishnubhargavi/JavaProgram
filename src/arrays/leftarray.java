package arrays;

import java.util.Arrays;

public class leftarray {
    public static void main(String[] args) {
        // Sample array
        int[] arr = {1, 2, 3, 4, 5, 6, 7};

        // Number of positions to rotate
        int x = 4;

        System.out.println("Original Array: " + Arrays.toString(arr));

        // Rotate the array to the left by x positions
        rotateLeft(arr, x);

        System.out.println("Rotated Array: " + Arrays.toString(arr));
    }

    // Function to rotate the array to the left by x positions
    private static void rotateLeft(int[] arr, int x) {
        int n = arr.length;

        // Normalize x to be within the range [0, n)
        x = x % n;

        // Create a temporary array to store the rotated elements
        int[] temp = new int[n];

        // Copy the elements to the temporary array with the correct rotation
        for (int i = 0; i < n; i++) {
            temp[(i - x + n) % n] = arr[i];
        }

        // Copy the rotated elements back to the original array
        System.arraycopy(temp, 0, arr, 0, n);
    }
}
