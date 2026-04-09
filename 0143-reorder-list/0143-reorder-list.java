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
    public void reorderList(ListNode head) {
        ListNode slow=head;
        ListNode fast=head;
        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        ListNode head2=slow.next;
        slow.next=null;
        ListNode prev=null;
        ListNode curr=head2;
        ListNode next;
        while(curr!=null){
            next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
        }

        head2=prev;
        ListNode ptr1=head;
        ListNode ptr2=head2;
        

        while(ptr1!=null && ptr2!=null){
             ListNode temp=ptr1.next;
             ptr1.next=new ListNode(ptr2.val);
             ptr1=ptr1.next;
             ptr1.next=temp;
             ptr1=ptr1.next;

             ptr2=ptr2.next;
        }
    }
}