package com.tushar.leetcode.editor.en;

import java.util.Map;
import java.util.Objects;
import java.util.Stack;

public class ValidParentheses {
    public static void main(String[] args) {
        Solution solution = new ValidParentheses().new Solution();
    }

    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        private final Map<String, String> openCloseMapping = Map.of("{", "}", "(", ")", "[", "]");

        public boolean isValid(String s) {

            if (s.length() == 1) {
                return false;
            }

            Stack<String> stack = new Stack<String>();

            for (int i = 0; i < s.length(); i++) {
                String currentChar = String.valueOf(s.charAt(i));
                if (openCloseMapping.containsKey(currentChar)) {
                    stack.push(currentChar);
                } else {
                    if (stack.isEmpty()) {
                        return false;
                    }
                    String lastValue = stack.pop();
                    if (Objects.equals(currentChar, openCloseMapping.get(lastValue))) {
                        return false;
                    }
                }

            }
            return stack.isEmpty();
        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}