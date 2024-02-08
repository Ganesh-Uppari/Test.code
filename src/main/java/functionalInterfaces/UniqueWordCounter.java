package functionalInterfaces;

import java.util.HashMap;
import java.util.Map;

public class UniqueWordCounter {
    public static void main(String[] args) {
        String inputString = "The quick brown fox jumps over the lazy dog";

        Map<String, Integer> wordCountMap = new HashMap<>();

        // Split the input string by whitespace and iterate over each word
        String[] words = inputString.split("\\s+");
        for (String word : words) {
            // Remove any punctuation marks from the word
            word = word.replaceAll("[^a-zA-Z]", "").toLowerCase();

            // Update the count in the map
            if (!word.isEmpty()) {
                wordCountMap.put(word, wordCountMap.getOrDefault(word, 0) + 1);
            }
        }

        // Count the number of unique words
        int uniqueWordCount = wordCountMap.size();

        // Print the count of unique words
        System.out.println("Number of unique words in the string: " + uniqueWordCount);
    }
}

