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
        if(head==null || head.next==null||head.next.next==null)return;
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
        ListNode ptr3=ptr2.next;

        while(ptr2!=null&&ptr1.next!=null){
               ptr2.next=ptr1.next;
               ptr1.next=ptr2;
               ptr1=ptr1.next.next;
               ptr2=ptr3;
               
               if(ptr1.next==null){
                ptr1.next=ptr2;
                break;
               }
               ptr3=(ptr3==null)?ptr3:ptr3.next;
        }
        while(head!=null){
            System.out.print(head.val+" ");
            head=head.next;
        }
    }
}