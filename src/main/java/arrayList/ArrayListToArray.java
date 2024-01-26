package arrayList;

import java.util.ArrayList;

public class ArrayListToArray {
    public static void main(String[] args) {
        // Create an ArrayList of Strings
        ArrayList<String> stringList = new ArrayList<>();
        stringList.add("Element 1");
        stringList.add("Element 2");
        stringList.add("Element 3");

        // Convert ArrayList to an array
        String[] stringArray = new String[stringList.size()];
        stringArray = stringList.toArray(stringArray);

        // Display the elements of the array
        System.out.println("Array elements:");
        for (String element : stringArray) {
            System.out.println(element);
        }
    }


        public static String[] convertArrayListToArray(ArrayList<String> stringList) {
            if (stringList == null) {
                return null;
            }

            String[] stringArray = new String[stringList.size()];
            return stringList.toArray(stringArray);
        }
    }