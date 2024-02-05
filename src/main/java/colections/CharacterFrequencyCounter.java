package colections;

import java.util.HashMap;
import java.util.Map;

public class CharacterFrequencyCounter {

    public HashMap<Character, Integer> printCharacterFrequency(String inputString) {
        // Create a map to store character frequencies
        HashMap<Character, Integer> charFrequencyMap = new HashMap<>();
        char[] charArray = inputString.toCharArray();
        int count = 0;
        for(Character character : charArray) {
            if(charFrequencyMap.containsKey(character)) {
                charFrequencyMap.put(character, charFrequencyMap.get(character) + 1);
            }
            else
                charFrequencyMap.put(character, 1);
        }

        return charFrequencyMap;
    }
}
