package arrays;

public class ArrayMinMax {
    public static void main(String[] args) {
        // Sample integer array
        int[] numbers = {12, 5, 23, 8, 17, 9, 31, 15};

        // Find the largest and smallest numbers
        int largest = findLargest(numbers);
        int smallest = findSmallest(numbers);

        // Display the results
        System.out.println("Largest Number: " + largest);
        System.out.println("Smallest Number: " + smallest);
    }

    // Method to find the largest number in the array
    public static int findLargest(int[] arr) {
        int largest = arr[0];

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > largest) {
                largest = arr[i];
            }
        }

        return largest;
    }

    // Method to find the smallest number in the array
    public static int findSmallest(int[] arr) {
        int smallest = arr[0];

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < smallest) {
                smallest = arr[i];
            }
        }

        return smallest;
    }
}
