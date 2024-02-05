package streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class RemoveDuplicatesExample {
    public static void main(String[] args) {
        // Example list of integers with duplicates
        List<Integer> integerList = Arrays.asList(1, 2, 3, 2, 4, 5, 1, 6, 5);

        // Remove duplicate elements using streams
        List<Integer> distinctList = removeDuplicates(integerList);

        // Displaying the result
        System.out.println("List after removing duplicates: " + distinctList);
    }

    private static List<Integer> removeDuplicates(List<Integer> inputList) {
        return inputList.stream()
                .distinct() // Remove duplicates
                .collect(Collectors.toList()); // Collect the result into a list
    }
}
