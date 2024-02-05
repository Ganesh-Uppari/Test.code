package hashMap;

import java.util.HashMap;

public class TwoSum {
    public static int[] findIndices(int[] nums, int target) {
        HashMap<Integer, Integer> numIndices = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];

            if (numIndices.containsKey(complement)) {
                return new int[]{numIndices.get(complement), i};
            }

            numIndices.put(nums[i], i);
        }

        return null;  // If no such pair is found
    }

    public static void main(String[] args) {
        int[] inputArray = {10, 20, 30, 40, 50, 60};
        int targetSum = 100;
        int[] result = findIndices(inputArray, targetSum);

        if (result != null) {
            System.out.println("Indices of the two numbers: [" + result[0] + ", " + result[1] + "]");
        } else {
            System.out.println("No pair found.");
        }
    }
}
