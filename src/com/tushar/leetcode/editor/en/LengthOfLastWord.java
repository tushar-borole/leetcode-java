package com.tushar.leetcode.editor.en;

public class LengthOfLastWord {
    public static void main(String[] args) {
        Solution solution = new LengthOfLastWord().new Solution();
        System.out.println(solution.lengthOfLastWord("   fly me   to   the moon  "));
    }

    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public int lengthOfLastWord(String s) {

            int length = 0;
            for (int i = s.length() - 1; i >= 0; i--) {
                String currentValue = String.valueOf(s.charAt(i));
                if (length > 0 && currentValue.equals(" ")) {
                    break;
                }
                if (!currentValue.equals(" ")) {
                    length++;
                }
            }


            return length;
        }

        ;
    }
//leetcode submit region end(Prohibit modification and deletion)

}