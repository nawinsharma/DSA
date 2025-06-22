class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode dummyNode = new ListNode(-1);
        dummyNode.next = head;
        ListNode p1 = dummyNode;
        ListNode p2 = dummyNode;
   
        for (int i = 0; i < n; i++) {
            p2 = p2.next;
        }
        
        while (p2.next != null) {
            p1 = p1.next;
            p2 = p2.next;
        }
        p1.next = p1.next.next;
        return dummyNode.next;
    }
}