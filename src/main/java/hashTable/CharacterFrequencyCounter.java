package hashTable;

import java.util.HashMap;
import java.util.Map;

public class CharacterFrequencyCounter {
    public static void main(String[] args) {
        String inputString = "test string";
        printCharacterFrequency(inputString);
    }

    public static void printCharacterFrequency(String inputString) {
        // Create a map to store character frequencies
        Map<Character, Integer> charFrequencyMap = new HashMap<>();

        // Traverse the input string
        for (char ch : inputString.toCharArray()) {
            // Update the frequency in the map
            charFrequencyMap.put(ch, charFrequencyMap.getOrDefault(ch, 0) + 1);
        }

        // Print the distinct characters and their frequencies
        System.out.println("Character frequencies in the string:");
        for (Map.Entry<Character, Integer> entry : charFrequencyMap.entrySet()) {
            System.out.println(entry.getKey() + "-" + entry.getValue());
        }
    }
}
