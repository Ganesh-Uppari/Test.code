package streams;

import java.util.Arrays;
import java.util.stream.Collectors;

public class CapitalizeAndSortStrings {
    public static void main(String[] args) {
        // Example array of strings
        String[] stringArray = {"apple", "banana", "orange", "grape", "kiwi"};

        // Capitalize the first letter of each string using Streams and Lambdas
        stringArray = Arrays.stream(stringArray)
                .map(s -> s.substring(0, 1).toUpperCase() + s.substring(1))
                .toArray(String[]::new);

        // Sort the strings in alphabetical order using Streams and Lambdas
        Arrays.sort(stringArray);

        // Print the modified and sorted strings using Streams and Lambdas
        System.out.println("Capitalized and Sorted Strings:");
        Arrays.stream(stringArray).forEach(System.out::println);
    }
}
