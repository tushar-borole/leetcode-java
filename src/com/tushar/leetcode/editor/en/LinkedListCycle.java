package com.tushar.leetcode.editor.en;

import java.util.HashSet;

public class LinkedListCycle {
    public static void main(String[] args) {
        Solution solution = new LinkedListCycle().new Solution();
    }
    //leetcode submit region begin(Prohibit modification and deletion)

    //  Definition for singly-linked list.
    class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
            next = null;
        }
    }

    public class Solution {
        public boolean hasCycle(ListNode head) {
            HashSet<ListNode> nodeSet = new HashSet();
            ListNode current = head;

            while (current != null) {
                if (nodeSet.contains(current)) {
                    return true;
                }
                nodeSet.add(current);
                current = current.next;
            }

            return false;

        }

        ;
    }
//leetcode submit region end(Prohibit modification and deletion)

}