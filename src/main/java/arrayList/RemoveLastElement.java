package arrayList;

import java.util.ArrayList;

public class RemoveLastElement {
    public static void main(String[] args) {
        // Create an ArrayList of Strings
        ArrayList<String> stringList = new ArrayList<>();
        stringList.add("Element 1");
        stringList.add("Element 2");
        stringList.add("Element 3");
        stringList.add("Element 4");

        // Display the original ArrayList
        System.out.println("Original ArrayList: " + stringList);

        // Remove the last object from the ArrayList
        if (!stringList.isEmpty()) {
            stringList.remove(stringList.size() - 1);
            System.out.println("After removing the last element: " + stringList);
        } else {
            System.out.println("ArrayList is empty. No element to remove.");
        }
    }
}
