package arrays;

import java.util.Arrays;

public class movezero {
    public static void main(String[] args) {
        // Sample array
        int[] numbers = {0, 2, 0, 4, 0, 6, 7, 8, 0};

        System.out.println("Original Array: " + Arrays.toString(numbers));

        // Move zeros to the end of the array
        moveZerosToEnd(numbers);

        System.out.println("Array after moving zeros to the end: " + Arrays.toString(numbers));
    }

    // Function to move zeros to the end of the array
    private static void moveZerosToEnd(int[] nums) {
        int nonZeroIndex = 0;

        // Iterate through the array and move non-zero elements to the front
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                // Swap non-zero element to the front
                int temp = nums[i];
                nums[i] = nums[nonZeroIndex];
                nums[nonZeroIndex] = temp;

                // Move the non-zero index forward
                nonZeroIndex++;
            }
        }
    }
}
