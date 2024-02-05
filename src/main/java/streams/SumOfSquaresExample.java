package streams;

import java.util.Arrays;
import java.util.List;

public class SumOfSquaresExample {
    public static void main(String[] args) {
        // Example list of integers
        List<Integer> integerList = Arrays.asList(1, 2, 3, 4, 5);

        // Calculate the sum of squares of positive integers using streams
        int sumOfSquares = calculateSumOfSquares(integerList);

        // Displaying the result
        System.out.println("Sum of Squares: " + sumOfSquares);
    }

    private static int calculateSumOfSquares(List<Integer> inputList) {
        return inputList.stream()
                .filter(n -> n > 0) // Filter out non-positive integers
                .mapToInt(n -> n * n) // Square each positive integer
                .sum(); // Calculate the sum of squares
    }
}
