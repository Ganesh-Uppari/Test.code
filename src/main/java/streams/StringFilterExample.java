package streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class StringFilterExample {
    public static void main(String[] args) {
        // Example list of strings
        List<String> stringList = Arrays.asList("Apple", "Banana", "Orange", "Grape", "Kiwi");

        // Filtering out strings starting with the letter "A"
        List<String> filteredList = filterStrings(stringList, s -> !s.startsWith("A"));

        // Displaying the filtered list
        System.out.println("Filtered List: " + filteredList);
    }

    private static List<String> filterStrings(List<String> inputList, Predicate<String> predicate) {
        return inputList.stream()
                .filter(predicate)
                .collect(Collectors.toList());
    }

    public static class FilterAndDoubleExample {
        public static void main(String[] args) {
            // Example list of integers
            List<Integer> integerList = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

            // Filtering out even numbers and doubling each remaining number using streams
            List<Integer> doubledList = doubleOddNumbers(integerList);

            // Displaying the result
            System.out.println("Filtered and Doubled List: " + doubledList);
        }

        private static List<Integer> doubleOddNumbers(List<Integer> inputList) {
            return inputList.stream()
                    .filter(n -> n % 2 != 0) // Filter out even numbers
                    .map(n -> n * 2) // Double each remaining number
                    .collect(Collectors.toList());
        }
    }
}

