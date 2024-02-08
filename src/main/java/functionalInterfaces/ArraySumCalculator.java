package functionalInterfaces;

public class ArraySumCalculator {
    public static void main(String[] args) {
        // Initialize an array
        int[] array = {10, 20, 30, 40, 50};

        // Calculate the sum of all items
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }

        // Print the sum
        System.out.println("Sum of all items in the array: " + sum);
    }
}
