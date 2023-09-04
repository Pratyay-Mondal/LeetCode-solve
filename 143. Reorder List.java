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

    public ListNode midnode(ListNode head) {
        ListNode fast = head, slow = head;
        while(fast.next != null && fast.next.next != null){
            fast = fast.next.next;
            slow = slow.next;
        }
        return slow;
    }


    public ListNode reverse(ListNode head) {
        ListNode curr = head, prev = null, next = null;

        while(curr != null){
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        return prev;
    }


    public void reorderList(ListNode head) {
        ListNode midnode = midnode(head);
        ListNode nextToMid = midnode.next;
        midnode.next = null;
        ListNode p2 = reverse(nextToMid);

        ListNode p1 = head, p1next;
        while(p1 != null && p2 != null){
            p1next = p1.next;
            p1.next = p2;
            p1=p2;
            p2=p1next;
        }

    }
}
