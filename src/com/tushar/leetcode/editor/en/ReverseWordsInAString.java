package com.tushar.leetcode.editor.en;

public class ReverseWordsInAString {
    public static void main(String[] args) {
        Solution solution = new ReverseWordsInAString().new Solution();
        solution.reverseWords("  hello world  ");
    }

    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public String reverseWords(String s) {
            StringBuilder out = new StringBuilder();
            StringBuilder temp = new StringBuilder();
            for (int i = s.length() - 1; i >= 0; i--) {

                if (s.charAt(i) != ' ') {
                    temp.append(s.charAt(i));
                }
                if (!temp.isEmpty() && (s.charAt(i) == ' ' || i == 0)) {
                    out.append(temp.reverse());
                    out.append(" ");
                    temp = new StringBuilder();
                }
            }
            return out.substring(0, out.length() - 1);
        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}