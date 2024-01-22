package conditions;

import java.util.Arrays;

public class bubblesort {
    public static void main(String[] args) {
        // Sample array
        int[] numbers = {5, 2, 9, 1, 5, 6};

        System.out.println("Original Array: " + Arrays.toString(numbers));

        // Sort the array using Bubble Sort
        bubbleSort(numbers);

        System.out.println("Sorted Array: " + Arrays.toString(numbers));
    }

    // Function to perform Bubble Sort on an array
    private static void bubbleSort(int[] arr) {
        int n = arr.length;

        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                // Swap if the element found is greater than the next element
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }
}

