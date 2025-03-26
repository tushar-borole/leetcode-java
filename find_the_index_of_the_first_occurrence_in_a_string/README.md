# Find the Index of the First Occurrence in a String

## Problem Statement

You are given two strings, `needle` and `haystack`. The task is to determine the index of the first occurrence of the
string `needle` within the string `haystack`. If the `needle` is not part of the `haystack`, return `-1`.

### Example 1:

- **Input**: `haystack = "sadbutsad"`, `needle = "sad"`
- **Output**: `0`
- **Explanation**: The substring `"sad"` first occurs at index `0` (also occurs again at index `6`), so we return `0`.

### Example 2:

- **Input**: `haystack = "leetcode"`, `needle = "leeto"`
- **Output**: `-1`
- **Explanation**: The substring `"leeto"` does not occur in `"leetcode"`, so we return `-1`.

### Constraints:

- `1 <= haystack.length, needle.length <= 10^4`
- Both `haystack` and `needle` consist of only lowercase English characters.

---

## Solution

### Approach:

The solution involves iterating through the `haystack` and checking if the substring of length equal to `needle` matches
`needle`.

1. Traverse through the `haystack` starting from index `i = 0` to `i = haystack.length - needle.length`.
2. At each index `i`, check if the substring of `haystack` from `i` to `i + needle.length` equals `needle`.
3. If found, record the index and terminate the loop.
4. If no such substring exists, return `-1`.

### Algorithm:

1. **Edge Case Handling**: If the `needle.length > haystack.length`, return `-1`.
2. **Iterate**: Loop through `haystack` and extract substrings of the same length as `needle`.
3. **Comparison**: Compare each substring with `needle`.
4. **Return Index**: Return the first matching index. If no match, return `-1`.

---

## Code Implementation

Here is the Java implementation of the solution:

```java
package find_the_index_of_the_first_occurrence_in_a_string;

class Solution {
    public int strStr(String haystack, String needle) {
        int matchIndex = -1; // Initialize match index as -1 (default value if 'needle' is not found)
        for (int i = 0; i <= (haystack.length() - needle.length()); i++) {
            if (haystack.substring(i, i + needle.length()).equals(needle)) {
                matchIndex = i; // If match is found, store the index
                break; // Exit the loop after finding the first occurrence
            }
        }
        return matchIndex; // Return the matching index or -1
    }
}
```

---

## Complexity Analysis

### Time Complexity:

- **Outer loop**:
    - Iterates through `haystack` until `(haystack.length - needle.length)`, which is
      `O(haystack.length - needle.length + 1)`.
- **Substring Comparison**:
    - Each comparison of substrings takes `O(needle.length)` time.
- Combined, the **worst-case complexity** is `O(haystack.length * needle.length)`.

### Space Complexity:

- The solution uses constant space, i.e., **O(1)**, as no extra data structures are used.

---

## Summary

This approach efficiently determines the index of the first occurrence of `needle` in `haystack` by leveraging substring
comparisons. It handles edge cases like when the `needle` is longer than the `haystack` or when the `needle` does not
exist in the `haystack`, returning appropriate results in such cases.