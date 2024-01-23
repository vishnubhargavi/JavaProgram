package Strings;

import java.util.Scanner;
public class vowel_count {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input the string
        System.out.print("Enter a string: ");
        String inputString = scanner.nextLine();

        // Count vowels
        int vowelCount = countVowels(inputString);

        // Output the result
        System.out.println("Number of vowels: " + vowelCount);

        // Close the scanner
        scanner.close();
    }

    private static int countVowels(String str) {
        int count = 0;

        // Convert the string to lowercase for case-insensitivity
        str = str.toLowerCase();

        // Loop through each character in the string
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            // Check if the character is a vowel
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                count++;
            }
        }

        return count;
    }
}

