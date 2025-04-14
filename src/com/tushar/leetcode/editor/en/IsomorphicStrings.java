package com.tushar.leetcode.editor.en;

import java.util.HashMap;

public class IsomorphicStrings {
    public static void main(String[] args) {
        Solution solution = new IsomorphicStrings().new Solution();
        solution.isIsomorphic("egg", "add");
    }

    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public boolean isIsomorphic(String s, String t) {
            // If the lengths are not equal, the strings can't be isomorphic
            if (s.length() != t.length()) {
                return false;
            }

            // Maps for character mappings in both directions
            HashMap<Character, Character> sToT = new HashMap<>();
            HashMap<Character, Character> tToS = new HashMap<>();

            for (int i = 0; i < s.length(); i++) {
                char charS = s.charAt(i);
                char charT = t.charAt(i);

                // Check if there is an existing mapping for charS in sToT
                if (sToT.containsKey(charS)) {
                    if (sToT.get(charS) != charT) {
                        return false; // Conflict in mapping
                    }
                } else {
                    sToT.put(charS, charT);
                }

                // Check if there is an existing mapping for charT in tToS
                if (tToS.containsKey(charT)) {
                    if (tToS.get(charT) != charS) {
                        return false; // Conflict in mapping
                    }
                } else {
                    tToS.put(charT, charS);
                }
            }

            return true;
        }

    }
//leetcode submit region end(Prohibit modification and deletion)

}