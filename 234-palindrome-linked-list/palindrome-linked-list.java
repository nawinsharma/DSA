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
    public boolean isPalindrome(ListNode head) {
        ListNode middle = findMiddle(head);
        ListNode temp = reverse(middle);
        while(temp != null && head!=null){
            if(temp.val != head.val){
                return false;
            }
            temp = temp.next;
            head = head.next;
        }
        return true;
    }
    public static ListNode findMiddle(ListNode head){
        ListNode slow = head;
        ListNode fast = head;
        while(fast != null && fast.next != null){
            fast = fast.next.next;
            slow = slow.next;
        }
        return slow;
    }
    public static ListNode reverse(ListNode head){
     ListNode p = null;
     ListNode q = null;
     ListNode r = head;
     while(r != null){
        p = q;
        q = r;
        r = r.next;
        q.next = p;
     }   
     return q;
    }
}