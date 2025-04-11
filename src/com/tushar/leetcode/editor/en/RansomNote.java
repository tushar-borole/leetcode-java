package com.tushar.leetcode.editor.en;

import java.util.HashMap;

public class RansomNote {
    public static void main(String[] args) {
        Solution solution = new RansomNote().new Solution();
        solution.canConstruct("aa", "ab");
    }

    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public boolean canConstruct(String ransomNote, String magazine) {

            HashMap<String, Integer> ransomNoteMap = new HashMap<>();
            for (int i = 0; i < ransomNote.length(); i++) {
                String currentStr = String.valueOf(ransomNote.charAt(i));
                if (!ransomNoteMap.containsKey(currentStr)) {
                    ransomNoteMap.put(currentStr, 1);
                } else {
                    Integer currentValue = ransomNoteMap.get(currentStr) + 1;
                    ransomNoteMap.put(currentStr, currentValue);
                }
            }


            for (int i = 0; i < magazine.length(); i++) {
                String currentStr = String.valueOf(magazine.charAt(i));
                if (ransomNoteMap.containsKey(currentStr)) {
                    int currentValue = ransomNoteMap.get(currentStr) - 1;
                    if (currentValue == 0) {
                        ransomNoteMap.remove(currentStr);
                    } else {
                        ransomNoteMap.put(currentStr, currentValue);
                    }
                }
            }

            if (ransomNoteMap.isEmpty()) {
                return true;
            }

            return false;
        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}