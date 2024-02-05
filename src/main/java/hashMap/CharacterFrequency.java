package hashMap;

import java.util.HashMap;

public class CharacterFrequency {
    public static void printCharacterFrequency(String input) {
        HashMap<Character, Integer> charCount = new HashMap<>();

        // Count the frequency of each character
        for (char ch : input.toCharArray()) {
            charCount.put(ch, charCount.getOrDefault(ch, 0) + 1);
        }

        // Print the results
        System.out.print("Output: ");
        for (char ch : charCount.keySet()) {
            System.out.print(ch + "-" + charCount.get(ch) + ", ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        String inputString = "test string";
        printCharacterFrequency(inputString);
    }
}
