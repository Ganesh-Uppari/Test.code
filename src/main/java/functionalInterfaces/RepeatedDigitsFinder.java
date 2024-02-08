package functionalInterfaces;

import java.util.HashMap;
import java.util.Map;

public class RepeatedDigitsFinder {
    public static void main(String[] args) {
        int number = 122354667;

        Map<Integer, Integer> digitCountMap = new HashMap<>();

        // Count occurrences of each digit
        while (number > 0) {
            int digit = number % 10;
            digitCountMap.put(digit, digitCountMap.getOrDefault(digit, 0) + 1);
            number /= 10;
        }

        // Print repeated digits
        System.out.println("Repeated digits in the number:");
        for (Map.Entry<Integer, Integer> entry : digitCountMap.entrySet()) {
            if (entry.getValue() > 1) {
                System.out.println(entry.getKey() + " - " + entry.getValue() + " times");
            }
        }
    }
}
