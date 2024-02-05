package streams;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class GroupByLengthExample {
    public static void main(String[] args) {
        // Example list of strings
        List<String> stringList = Arrays.asList("apple", "banana", "orange", "grape", "kiwi");

        // Group strings by their length using streams
        Map<Integer, List<String>> groupedByLength = groupByLength(stringList);

        // Displaying the result
        groupedByLength.forEach((length, strings) ->
                System.out.println("Strings with length " + length + ": " + strings));
    }

    private static Map<Integer, List<String>> groupByLength(List<String> inputList) {
        return inputList.stream()
                .collect(Collectors.groupingBy(String::length));
    }
}
