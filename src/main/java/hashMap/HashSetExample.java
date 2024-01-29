package hashMap;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetExample {
    public static void main(String[] args) {
        // Create a HashSet of strings
        HashSet<String> stringHashSet = getStrings();

        // Iterate using Iterator
        System.out.println("Iterating using Iterator:");
        Iterator<String> iterator = stringHashSet.iterator();
        while (iterator.hasNext()) {
            String element = iterator.next();
            System.out.println(element);
        }

        // Iterate using traditional for loop
        System.out.println("\nIterating using for loop:");
        Object[] array = stringHashSet.toArray(); // Convert HashSet to an array for indexing
        for (int i = 0; i < array.length; i++) {
            String element = (String) array[i];
            System.out.println(element);
        }

        // Iterate using enhanced for loop
        System.out.println("\nIterating using enhanced for loop:");
        for (String element : stringHashSet) {
            System.out.println(element);
        }
    }

    private static HashSet<String> getStrings() {
        HashSet<String> stringHashSet = new HashSet<>();

        // Add 10 strings to the HashSet
        stringHashSet.add("Apple");
        stringHashSet.add("Banana");
        stringHashSet.add("Cherry");
        stringHashSet.add("Date");
        stringHashSet.add("Grapes");
        stringHashSet.add("Orange");
        stringHashSet.add("Peach");
        stringHashSet.add("Pear");
        stringHashSet.add("Strawberry");
        stringHashSet.add("Watermelon");
        return stringHashSet;
    }
}
