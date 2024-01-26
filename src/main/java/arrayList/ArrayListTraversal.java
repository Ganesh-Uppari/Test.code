package arrayList;

import java.util.ArrayList;

public class ArrayListTraversal {
    public static void main(String[] args) {
        // Create an ArrayList of Strings
        ArrayList<String> stringList = new ArrayList<>();
        stringList.add("Element 1");
        stringList.add("Element 2");
        stringList.add("Element 3");
        stringList.add("Element 4");

        // Traverse using for loop
        System.out.println("Traversing using for loop:");
        for (int i = 0; i < stringList.size(); i++) {
            String element = stringList.get(i);
            System.out.println(element);
        }

        // Traverse using enhanced for loop
        System.out.println("\nTraversing using enhanced for loop:");
        for (String element : stringList) {
            System.out.println(element);
        }
    }
}
