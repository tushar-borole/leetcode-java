package com.tushar.leetcode.editor.en;

public class LongestCommonPrefix {
    public static void main(String[] args) {
        Solution solution = new LongestCommonPrefix().new Solution();
    }

    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public String longestCommonPrefix(String[] strs) {

            if (strs.length == 0) {
                return "";
            }
            String prefix = strs[0];

            for (int i = 1; i < strs.length; i++) {
                while (strs[i].indexOf(prefix) != 0) {
                    prefix = prefix.substring(0, prefix.length() - 1);
                }
            }
            return prefix;
        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}