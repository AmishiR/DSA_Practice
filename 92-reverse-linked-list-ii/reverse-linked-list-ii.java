class Solution {
    public ListNode reverseBetween(ListNode head, int left, int right) {
        if (head == null || left == right) return head;

        ListNode dummy = new ListNode(0);
        dummy.next = head;

        ListNode leftPrev = dummy;
        ListNode curr = head;

        for (int i = 0; i <left-1 ; i++) {
            leftPrev = curr;
            curr = curr.next;
        }

        ListNode subListTail = curr;
        ListNode prev = null;

        for (int i = 0; i < right - left + 1; i++) {
            ListNode nextTemp = curr.next;
            curr.next = prev;
            prev = curr;
            curr = nextTemp;
        }

        leftPrev.next = prev;
        subListTail.next = curr;

        return dummy.next;
    }
}