package colections;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetExample {
    public static void main(String[] args) {
        // Create a HashSet of Strings
        HashSet<String> stringSet = new HashSet<>();

        // Add 10 strings to the HashSet
        for(int i = 1; i <= 10; i++)
            stringSet.add("Code" + i);

        // Iterate using Iterator
        System.out.println("Iterating using Iterator:");
        Iterator<String> iterator = stringSet.iterator();
        while (iterator.hasNext()) {
            String fruit = iterator.next();
            System.out.println(fruit);
        }

        // Iterate using for loop
        System.out.println("\nIterating using for loop:");
        Object[] stringArray = stringSet.toArray();
        for (int i = 0; i < stringArray.length; i++) {
            String fruit = (String) stringArray[i];
            System.out.println(fruit);
        }

        // Iterate using enhanced for loop
        System.out.println("\nIterating using enhanced for loop:");
        for (String fruit : stringSet) {
            System.out.println(fruit);
        }
    }
}
