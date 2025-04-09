package com.tushar.leetcode.editor.en;

public class MinimumSizeSubarraySum {
    public static void main(String[] args) {
        Solution solution = new MinimumSizeSubarraySum().new Solution();
    }

    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public int minSubArrayLen(int target, int[] nums) {
            // [2,3,1,2,4,3]

            int left = 0;
            int right = 0;
            int sumOfCurrentWindow = 0;
            int res = Integer.MAX_VALUE;


            for (right = 0; right < nums.length; right++) {
                sumOfCurrentWindow = sumOfCurrentWindow + nums[right];
                while (sumOfCurrentWindow >= target) {
                    res = Math.min(res, right - left + 1);
                    sumOfCurrentWindow = sumOfCurrentWindow - nums[left];
                    left++;
                }
            }


            if (res == Integer.MAX_VALUE) {
                return 0;
            }

            return res;
        }
        

    }
//leetcode submit region end(Prohibit modification and deletion)

}