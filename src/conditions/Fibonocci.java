package conditions;

import java.util.Scanner;
public class Fibonocci {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the value of n : ");
        int n = scanner.nextInt();

        System.out.println("Fibonacci series up to " + n + " terms:");
        fibonacciSeries(n);
    }

    public static void fibonacciSeries(int n) {
        int firstTerm = 0, secondTerm = 1;

        for (int i = 0; i < n; i++) {
            System.out.print(firstTerm + " ");

            int nextTerm = firstTerm + secondTerm;
            firstTerm = secondTerm;
            secondTerm = nextTerm;
        }
    }
}
