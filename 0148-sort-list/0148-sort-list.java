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
    public ListNode sortList(ListNode head) {
        if(head == null || head.next == null);
        ListNode temp = head;
        int n = 0;
        while(temp != null) {
            n++;
            temp = temp.next;
        }
        temp = head;

        int[] ans = new int[n];
        for(int i = 0; i < n; i++){
            ans[i] = temp.val;
            temp = temp.next;
        }
        
        Arrays.sort(ans);
        ListNode dummy = new ListNode(-1);
        ListNode tail = dummy;
        for(int i = 0; i < n; i++){
            ListNode newnode = new ListNode(ans[i]);
            tail.next = newnode;
            tail = tail.next;
        }
        tail.next = null;

        return dummy.next;
    }
}