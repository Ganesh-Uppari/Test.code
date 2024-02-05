package streams;

import java.util.Arrays;

public class StringsContainingVowels {
    public static void main(String[] args) {
        // Example array of strings
        String[] stringArray = {"apple", "banana", "orange", "grape", "kiwi"};

        // Print strings containing vowels and the count of vowels using Streams and Lambdas
        Arrays.stream(stringArray)
                .filter(s -> containsVowels(s))
                .forEach(s -> System.out.println("String: " + s + ", Vowel Count: " + countVowels(s)));
    }

    private static boolean containsVowels(String str) {
        return str.toLowerCase().matches(".*[aeiou].*");
    }

    private static long countVowels(String str) {
        return str.toLowerCase().chars().filter(c -> "aeiou".indexOf(c) != -1).count();
    }
}
