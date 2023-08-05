/*
203. Remove Linked List Elements : https://leetcode.com/problems/remove-linked-list-elements/
Given the head of a linked list and an integer val, remove all the nodes of the linked list that has Node.val == val, and return the new head.
*/


//recursion:
class Solution {
    public ListNode removeElements(ListNode head, int val) {
        if (head == null){
            return null;
        }
        head.next = removeElements(head.next, val);
        return head.val == val ? head.next : head;
    }
}



//Iteration without using previous pointer:
class Solution {
    public ListNode removeElements(ListNode head, int val) {
        if (head == null) {
            return null;
        }

        ListNode dummy = new ListNode();
        dummy.next = head;
        ListNode cur = dummy;

        while (cur.next != null) {
            if (cur.next.val == val) {
                cur.next = cur.next.next;
                // Here cannot move cur to cur.next as we need to validate the next node.
            } else {
                cur = cur.next;
            }
        }

        return dummy.next;
    }
}



//Iteration with using previous pointer:
class Solution {
    public ListNode removeElements(ListNode head, int val) {
        if (head == null) {
            return null;
        }

        ListNode dummy = new ListNode();
        dummy.next = head;
        ListNode cur = head;
        ListNode prev = dummy;

        while (cur != null) {
            if (cur.val == val) {
                prev.next = cur.next;
            } else {
                prev = cur;
            }
            cur = cur.next;
        }

        return dummy.next;
    }
}
