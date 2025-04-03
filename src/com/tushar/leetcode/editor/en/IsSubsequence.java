package com.tushar.leetcode.editor.en;

import java.util.Objects;

public class IsSubsequence {
    public static void main(String[] args) {
        Solution solution = new IsSubsequence().new Solution();
        solution.isSubsequence("abc", "ahbgdc");
        solution.isSubsequence("axc", "ahbgdc");
    }

    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public boolean isSubsequence(String s, String t) {
            int i = 0;
            for (int j = 0; j < t.length(); j++) {
                if (i < s.length()) {
                    String currentChar = String.valueOf(t.charAt(j));
                    String initialChar = String.valueOf(s.charAt(i));
                    if (Objects.equals(initialChar, currentChar)) {
                        i = i + 1;
                    }
                }
            }

            return i == s.length();
        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}