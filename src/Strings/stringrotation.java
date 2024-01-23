package Strings;

import java.util.Scanner;

public class stringrotation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input the two strings
        System.out.print("Enter the first string: ");
        String str1 = scanner.nextLine();

        System.out.print("Enter the second string: ");
        String str2 = scanner.nextLine();

        // Check if one string is a rotation of another
        boolean isRotation = checkRotation(str1, str2);

        // Output the result
        if (isRotation) {
            System.out.println("One string is a rotation of another");
        } else {
            System.out.println("One string is not a rotation of another");
        }

        // Close the scanner
        scanner.close();
    }

    private static boolean checkRotation(String str1, String str2) {
        // Check if lengths are equal and not zero
        if (str1.length() != str2.length() || str1.length() == 0) {
            return false;
        }

        // Concatenate the first string with itself
        String concatenated = str1 + str1;

        // Check if the second string is a substring of the concatenated string
        return concatenated.contains(str2);
    }
}
