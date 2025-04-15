package com.tushar.leetcode.editor.en;

import java.util.HashMap;
import java.util.Objects;

public class WordPattern {
    public static void main(String[] args) {

        Solution solution = new WordPattern().new Solution();
        solution.wordPattern("abba", "dog dog dog dog");
    }

    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public boolean wordPattern(String pattern, String s) {
            String[] sArray = s.split(" ");
            if (pattern.length() != sArray.length) {
                return false;
            }
            HashMap<Character, String> mappingPToS = new HashMap();
            HashMap<String, Character> mappingSToP = new HashMap();

            for (int i = 0; i < pattern.length(); i++) {
                char current = pattern.charAt(i);
                String currentArrayValue = sArray[i];


                if (mappingSToP.containsKey(currentArrayValue) && mappingSToP.get(currentArrayValue) != current) {
                    return false;
                }

                if (mappingPToS.containsKey(current) && !Objects.equals(mappingPToS.get(current), sArray[i])) {
                    return false;
                }

                mappingPToS.put(current, sArray[i]);
                mappingSToP.put(sArray[i], current);
                sArray[i] = String.valueOf(current);

            }
            return pattern.equals(String.join("", sArray));
        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}