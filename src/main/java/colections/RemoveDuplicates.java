package colections;

import java.util.LinkedHashSet;

public class RemoveDuplicates {
    public static void main(String[] args) {
        String inputString = "programming";

        // Remove duplicates using LinkedHashSet
        String resultString = removeDuplicates(inputString);

        // Print the resulting string
        System.out.println("Original String: " + inputString);
        System.out.println("String after removing duplicates: " + resultString);
    }

    public static String removeDuplicates(String input) {
        // Use LinkedHashSet to maintain order and remove duplicates
        LinkedHashSet<Character> charSet = new LinkedHashSet<>();

        // Add characters to LinkedHashSet
        for (char c : input.toCharArray()) {
            charSet.add(c);
        }

        // Build the resulting string
        StringBuilder result = new StringBuilder();
        for (char c : charSet) {
            result.append(c);
        }

        return result.toString();
    }
}
