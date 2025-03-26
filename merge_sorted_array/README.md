# Majority Element - Problem 169

This repository includes the solution to **"Majority Element"**, a **LeetCode problem (Easy)**. The main objective is to
identify the majority element in an array, as defined below.

---

## Problem Description

**Given:** An integer array `nums` of size `n`.

**Return:** The majority element.

### Definition:

The **majority element** is the element that appears more than ⌊n / 2⌋ times. It is guaranteed that the majority element
always exists in the given array.

---

### Examples:

#### Example 1:

- **Input:** `nums = [3,2,3]`
- **Output:** `3`

#### Example 2:

- **Input:** `nums = [2,2,1,1,1,2,2]`
- **Output:** `2`

---

### Constraints:

- `n == nums.length`
- `1 <= n <= 5 * 10⁴`
- `-10⁹ <= nums[i] <= 10⁹`

---

## Follow-Up

Could you solve the problem:

- In **linear time** (O(n))
- Using **constant space** (O(1))

---

## Solution Approaches

### 1. **Naive Approach (Counting Frequencies)**

- Use a `HashMap` to count the occurrences of each number.
- Return the key (number) that exceeds ⌊n / 2⌋ occurrences.
- **Time Complexity:** O(n)
- **Space Complexity:** O(n)

---

### 2. **Optimized Approach - Boyer-Moore Voting Algorithm**

- This algorithm tracks the majority element in **O(n)** time and **O(1)** space.
- The algorithm works in two steps:
    1. **Candidate Selection:** Identify a potential majority element by incrementing or decrementing a "vote count."
    2. **Verification:** Confirm whether the candidate is indeed the majority element.
- **Advantages**: Simple, efficient, scalable for large arrays.

---

## Edge Cases

- Single-element arrays, e.g., `[1]`.
- Arrays with duplicate elements, e.g., `[5, 5, 5, 5]`.
- Arrays with alternating elements where one dominates, e.g., `[1, 2, 1, 2, 1, 1]`.

---

## Applications

This problem is a practical example of frequency-based problems and is frequently used in algorithmic interviews to test
understanding of space-efficient solutions and optimization strategies.

---

Feel free to reach out or suggest improvements for this documentation! 🚀