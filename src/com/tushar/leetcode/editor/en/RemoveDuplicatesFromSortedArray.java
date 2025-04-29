package com.tushar.leetcode.editor.en;

public class RemoveDuplicatesFromSortedArray {
    public static void main(String[] args) {
        Solution solution = new RemoveDuplicatesFromSortedArray().new Solution();
    }

    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public int removeDuplicates(int[] nums) {
            int insertedIndex = 1;
            for (int i = 1; i < nums.length; i++) {
                if (nums[i] != nums[i - 1]) {
                    nums[insertedIndex] = nums[i];
                    insertedIndex++;
                }
            }
            return insertedIndex;

        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}