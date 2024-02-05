package streams;

import java.util.Arrays;
import java.util.Comparator;

public class CustomStringSorting {
    public static void main(String[] args) {
        // Example array of strings
        String[] stringArray = {"apple", "banana", "orange", "grape", "kiwi"};

        // Sort the array based on the specified criteria using Streams and Lambdas
        Arrays.sort(stringArray, Comparator
                .<String, Integer>comparing(String::length)
                .thenComparing(Comparator
                        .<String, Character>comparing(s -> s.charAt(s.length() - 1))
                        .reversed())
        );

        // Print the sorted array
        System.out.println("Sorted Array based on Length and Last Character:");
        Arrays.stream(stringArray).forEach(System.out::println);
    }
}
