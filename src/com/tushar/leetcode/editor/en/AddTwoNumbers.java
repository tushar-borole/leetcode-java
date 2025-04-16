package com.tushar.leetcode.editor.en;

public class AddTwoNumbers {
    public static void main(String[] args) {
        Solution solution = new AddTwoNumbers().new Solution();
    }
    //leetcode submit region begin(Prohibit modification and deletion)

    //  Definition for singly-linked list.
    public class ListNode {
        int val;
        ListNode next;

        ListNode() {
        }

        ListNode(int val) {
            this.val = val;
        }

        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }

    class Solution {
        public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
            ListNode currentli = l1;
            String l1Stack = "";
            while (currentli != null) {
                l1Stack = currentli.val + l1Stack;
                currentli = currentli.next;
            }

            ListNode currentl2 = l2;
            String l2Stack = "";
            while (currentl2 != null) {
                l2Stack = currentl2.val + l2Stack;
                currentl2 = currentl2.next;
            }

            String value = new StringBuilder(Integer.toString(Integer.parseInt(l1Stack) + Integer.parseInt(l2Stack))).reverse().toString();

            ListNode out = new ListNode(Character.getNumericValue(value.charAt(0)));
            ListNode current = out;

            for (int i = 1; i < value.length(); i++) {
                current.next = new ListNode(Character.getNumericValue(value.charAt(i)));
                current = current.next;
            }
            return out;
        }

        ;
    }
//leetcode submit region end(Prohibit modification and deletion)

}