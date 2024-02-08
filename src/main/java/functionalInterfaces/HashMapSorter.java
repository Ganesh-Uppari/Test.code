package functionalInterfaces;

import java.util.*;

public class HashMapSorter {
    public static void main(String[] args) {
        // Create a HashMap
        HashMap<Integer, String> hashMap = new HashMap<>();

        // Add elements to the HashMap
        hashMap.put(4, "apple");
        hashMap.put(2, "banana");
        hashMap.put(1, "orange");
        hashMap.put(3, "grapes");

        System.out.println("Original HashMap: " + hashMap);

        // Convert HashMap to TreeMap to sort based on keys
        TreeMap<Integer, String> sortedMap = new TreeMap<>(hashMap);

        System.out.println("Sorted HashMap based on keys: " + sortedMap);
    }
}
