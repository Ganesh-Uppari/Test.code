package student;

import java.util.Arrays;

public class CapitalizeAndSortStrings {
    public static void main(String[] args) {
        // Example array of strings
        String[] stringArray = {"apple", "banana", "orange", "grape", "kiwi"};

        // Capitalize the first letter of each string
        capitalizeFirstLetter(stringArray);

        // Sort the strings in alphabetical order
        Arrays.sort(stringArray);

        // Print the modified and sorted strings
        System.out.println("Capitalized and Sorted Strings:");
        for (String str : stringArray) {
            System.out.println(str);
        }
    }

    private static void capitalizeFirstLetter(String[] array) {
        for (int i = 0; i < array.length; i++) {
            if (array[i].length() > 0) {
                // Capitalize the first letter
                array[i] = array[i].substring(0, 1).toUpperCase() + array[i].substring(1);
            }
        }
    }
}
