# Merge Sorted Arrays (In-Place)

This README provides an overview of the problem statement, solution approach, and key details for merging two sorted
arrays into one, in-place, within a given array.

---

## Problem Statement

You are tasked with merging two **sorted integer arrays**, `nums1` and `nums2`, into a single sorted array. The
important requirements are:

1. **In-place** Storage:  
   The merged result must be stored in the array `nums1`.
2. **Array Length Constraints**:
    - `nums1` has a length of `m + n`, where the first `m` elements are the data to be merged, and the last `n` elements
      are initialized to `0` and meant to hold extra elements.
    - `nums2` has a length of `n` and contains all the elements to be merged.
3. **Non-decreasing Order**:  
   Both `nums1` and `nums2` are sorted in non-decreasing order.

### Example Inputs and Outputs

#### Example 1

**Input:**  
`nums1 = [1,2,3,0,0,0]`, `m = 3`, `nums2 = [2,5,6]`, `n = 3`  
**Output:**  
`[1,2,2,3,5,6]`

**Explanation:**  
Merge `[1,2,3]` and `[2,5,6]` to get `[1,2,2,3,5,6]`.

---

#### Example 2

**Input:**  
`nums1 = [1]`, `m = 1`, `nums2 = []`, `n = 0`  
**Output:**  
`[1]`

**Explanation:**  
Since `nums2` is empty, the result is simply `nums1`.

---

#### Example 3

**Input:**  
`nums1 = [0]`, `m = 0`, `nums2 = [1]`, `n = 1`  
**Output:**  
`[1]`

**Explanation:**  
Since `m = 0`, no elements exist in `nums1`. The result is just the elements of `nums2`.

---

## Constraints

- `nums1.length == m + n`
- `nums2.length == n`
- `0 <= m, n <= 200`
- `1 <= m + n <= 200`
- `-10⁹ <= nums1[i], nums2[j] <= 10⁹`

---

## Approach

### Key Insights

- The merging needs to be done **in-place** to avoid additional memory usage.
- To avoid overwriting the original elements in `nums1`, the merging starts **from the back** of the arrays.
- Three pointers are used:
    1. **`i`**: Points to the last valid element in the initial segment of `nums1` (`m - 1`).
    2. **`j`**: Points to the last valid element in `nums2` (`n - 1`).
    3. **`k`**: Points to the last position in `nums1` (`m + n - 1`).

### Step-by-Step Explanation

1. **Compare Elements in Reverse Order**:  
   Begin from the end of both arrays (`nums1` and `nums2`) and place the larger of the two at the current position in
   `nums1`.
2. **Handle Remaining Elements of `nums2`**:  
   If there are leftover elements in `nums2` after the comparison loop, copy them directly into `nums1` (this ensures
   correctness when all elements of `nums1` have already been placed).
3. **No Need to Handle Remaining `nums1` Elements**:  
   If there are leftover elements in `nums1`, they are already in their correct position.

### Complexity

1. **Time Complexity**:  
   `O(m + n)` — Each element of `nums1` and `nums2` is processed exactly once.
2. **Space Complexity**:  
   `O(1)` — The merging is done in-place, requiring no additional space.

---

### Examples of Execution

#### Input: `nums1 = [1,2,3,0,0,0]`, `m = 3`, `nums2 = [2,5,6]`, `n = 3`

1. **Start Pointers**:  
   `i = 2`, `j = 2`, `k = 5`
2. Compare and merge:
    - `nums2[2]` (6) > `nums1[2]` (3) → `nums1[5] = 6`, decrement pointers (`j = 1`, `k = 4`)
    - `nums2[1]` (5) > `nums1[2]` (3) → `nums1[4] = 5`, decrement pointers (`j = 0`, `k = 3`)
    - `nums2[0]` (2) ≤ `nums1[2]` (3) → `nums1[3] = 3`, decrement pointers (`i = 1`, `k = 2`)
    - `nums2[0]` (2) ≤ `nums1[1]` (2) → `nums1[2] = 2`, decrement pointers (`j = -1`, `k = 1`)
3. Remaining:  
   Copy remaining elements of `nums1` (none in this case).
4. **Output**: `[1,2,2,3,5,6]`

---

## Edge Cases to Consider

- `nums2` is empty (`n = 0`).
- `nums1` has no valid elements (`m = 0`).
- All elements of `nums1` are larger than or smaller than `nums2`.

---

## Usage

This function can be applied in scenarios where two sorted arrays need to be combined efficiently, such as:

- Merging two datasets in sorted order.
- Optimizing algorithms that require merging steps as part of processing (e.g., merge sort).

Using a simple, in-place merge reduces the space complexity while maintaining efficiency.

--- 

## License

This solution is open-source and available under the [MIT License](LICENSE). Feel free to use and modify it as needed.