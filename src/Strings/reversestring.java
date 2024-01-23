package Strings;

import java.util.Scanner;

public class reversestring {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input the sentence
        System.out.print("Enter a sentence: ");
        String inputSentence = scanner.nextLine();

        // Reverse each word in the sentence
        String reversedSentence = reverseWords(inputSentence);

        // Output the result
        System.out.println("Reversed sentence: " + reversedSentence);

        // Close the scanner
        scanner.close();
    }

    private static String reverseWords(String sentence) {
        // Split the sentence into words
        String[] words = sentence.split("\\s");

        // Reverse each word
        StringBuilder reversedSentence = new StringBuilder();
        for (String word : words) {
            String reversedWord = reverseString(word);
            reversedSentence.append(reversedWord).append(" ");
        }

        // Remove the trailing space and return the reversed sentence
        return reversedSentence.toString().trim();
    }

    private static String reverseString(String str) {
        // Convert the string to a character array
        char[] charArray = str.toCharArray();

        // Reverse the character array
        int start = 0;
        int end = charArray.length - 1;
        while (start < end) {
            // Swap characters at start and end positions
            char temp = charArray[start];
            charArray[start] = charArray[end];
            charArray[end] = temp;

            // Move towards the center
            start++;
            end--;
        }

        // Convert the character array back to a string
        return new String(charArray);
    }
}

