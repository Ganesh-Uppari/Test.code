package functionalInterfaces;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListReverser {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);

        System.out.println("Original ArrayList: " + list);

        // Reverse the ArrayList
        Collections.reverse(list);

        System.out.println("Reversed ArrayList: " + list);
    }
}
