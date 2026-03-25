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
        if(head == null ) return head;
        ListNode temp1 = head;
        int n = 0;
        while(temp1!=null) {
            n++;
            temp1 = temp1.next;
        }
        k = k%n;
        if(k == 0) return head;
        ListNode temp = head;
        while(temp.next != null) temp = temp.next;
        
        ListNode curr = head;
        for(int i = 1; i < n-k ; i++) {
            curr = curr.next;
        }
        temp.next = head;
        head = curr.next;
        curr.next = null;
        return head;
    }
}