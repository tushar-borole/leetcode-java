package find_the_index_of_the_first_occurrence_in_a_string;

class Solution {
    public int strStr(String haystack, String needle) {
        int matchIndex = -1;
        for (int i = 0; i <= (haystack.length() - needle.length()); i++) {
            if (haystack.substring(i, i + needle.length()).equals(needle)) {
                matchIndex = i;
                break;
            }
        }
        return matchIndex;
    }
}