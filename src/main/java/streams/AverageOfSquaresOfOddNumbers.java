package streams;

import java.util.Arrays;

public class AverageOfSquaresOfOddNumbers {
    public static void main(String[] args) {
        // Example array of integers
        Integer[] intArray = {1, 2, 3, 4, 5, 6, 7, 8, 9};

        // Find the average of squares of odd numbers using Streams and Lambdas
        double averageOfSquaresOfOddNumbers = Arrays.stream(intArray)
                .filter(n -> n % 2 != 0) // Filter odd numbers
                .mapToDouble(n -> Math.pow(n, 2)) // Square each odd number
                .average() // Calculate the average
                .orElse(0.0); // Default value if there are no odd numbers

        System.out.println("Average of Squares of Odd Numbers: " + averageOfSquaresOfOddNumbers);
    }
}
