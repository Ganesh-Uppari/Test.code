package arrays;

public class MoveZeros {
    public static void main(String[] args) {
        int[] numbers = {0, 1, 0, 3, 12};

        System.out.println("Original Array:");
        printArray(numbers);

        moveZeros(numbers);

        System.out.println("\nArray after moving 0's to the end:");
        printArray(numbers);
    }

    // Function to move all 0's to the end of the array
    static void moveZeros(int[] nums) {
        int nonZeroIndex = 0;

        // Iterate through the array and move non-zero elements to the front
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                nums[nonZeroIndex] = nums[i];
                nonZeroIndex++;
            }
        }

        // Fill the remaining positions with 0
        for (int i = nonZeroIndex; i < nums.length; i++) {
            nums[i] = 0;
        }
    }

    // Function to print elements of an array
    private static void printArray(int[] arr) {
        for (int value : arr) {
            System.out.print(value + " ");
        }
    }
}
