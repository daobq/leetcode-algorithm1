package algorithm1.linkedlist;

import algorithm1.common.ListNode;

public class _876_Middle_of_the_Linked_List {

    public static void main(String[] args) {

    }

    public ListNode middleNode(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }
}
