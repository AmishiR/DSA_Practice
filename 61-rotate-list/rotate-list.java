/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode rotateRight(ListNode head, int k) {
        int size = 0;
        if (head == null) {
            return head;
        }

        // Find the size of the linked list
        ListNode temp = head;
        while (temp != null) {
            size++;
            temp = temp.next;
        }

        // Reduce unnecessary rotations
        int swaps = k % size;
        System.out.println(swaps);

        // Perform swaps
        while (swaps-- > 0) {
            temp = head;
            ListNode prev = head;
            ListNode curr = head.next;

            // Move to the last node
            while (curr.next != null) {
                curr = curr.next;
                prev = prev.next;
            }

            // Rearrange pointers
            curr.next = head;
            prev.next = null;
            head = curr;
        }

        return head;
        
    }
}