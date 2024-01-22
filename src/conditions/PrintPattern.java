package conditions;

import java.util.Scanner;

public class PrintPattern {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of lines: ");
        int n = scanner.nextInt();

        Pattern(n);
    }

    public static void Pattern(int n) {
        for (int i = n; i >= 1; i--) {
            // Print '+' characters
            for (int j = 1; j <= i; j++) {
                System.out.print("+");
            }

            // Print '-' characters
            for (int k = 1; k <= n - i; k++) {
                System.out.print("-");
            }

            // Move to the next line
            System.out.println();
        }
    }
}
