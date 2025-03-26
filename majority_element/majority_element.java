package majority_element;

import java.util.HashMap;
import java.util.Map;

class Solution {
    public int majorityElement(int[] nums) {
        // iterate through the array and put it in hashmap the value it is repeated
        HashMap<Integer, Integer> repeatedValues = new HashMap<>();

        for (int num : nums) {
            repeatedValues.compute(num, (k, value) -> value == null ? 0 : value + 1);
        }
        Integer keyWithMaxValue = null;
        Integer minValue = Integer.MIN_VALUE;

        for (Map.Entry<Integer, Integer> entry : repeatedValues.entrySet()) {
            if (entry.getValue() > minValue) {
                minValue = entry.getValue();
                keyWithMaxValue = entry.getKey();
            }
        }
        return keyWithMaxValue;

        // return the key which has max repeated element
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] input = {1, 2, 3, 4, 4, 4};
        solution.majorityElement(input);
    }
}