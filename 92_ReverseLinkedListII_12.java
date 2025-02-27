class Solution {
    public ListNode reverseBetween(ListNode head, int left, int right) {
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode prev = dummy;
    
    for (int i=1;i<left;i++) {
        prev = prev.next;
    }

    ListNode current = prev.next;
    ListNode beforeLeft = prev;
    ListNode tail = current;

    for (int i=left ; i<=right ; i++) {
        ListNode nextnode = current.next;
        current.next = prev;
        prev = current;
        current = nextnode;
    }
    beforeLeft.next = prev;
    tail.next = current;

    return dummy.next;
    }
}
