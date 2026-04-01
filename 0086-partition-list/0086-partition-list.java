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
    public ListNode partition(ListNode head, int x) {
        ListNode head2=new ListNode(-101);
        ListNode ptr=head2;

        ListNode temp=head;
        while(temp!=null){
            if(temp.val<x){
                ptr.next=new ListNode(temp.val);
                ptr=ptr.next;
            }
            temp=temp.next;
        }

        temp=head;
        while(temp!=null){
            if(temp.val>=x){
                ptr.next=new ListNode(temp.val);
                ptr=ptr.next;
            }
            temp=temp.next;
        }
        head2=head2.next;
        return head2;
    }
}