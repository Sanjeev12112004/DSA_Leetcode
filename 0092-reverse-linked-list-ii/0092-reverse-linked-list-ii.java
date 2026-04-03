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
    public static ListNode reverse(ListNode head2){
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
       return head2;
    }
    public ListNode reverseBetween(ListNode head, int left, int right) {
        if(head==null || head.next==null) return head;
        ListNode head2=head;
        ListNode head3=head;
        ListNode tail=null;
        ListNode tail2=null;
        for(int i=1;i<=right;i++){
            if(i<left){
                tail2=head2;
                head2=head2.next;
            }
            tail=head3;
            head3=head3.next;
        }
        tail.next=null;
        head2=reverse(head2);

        if(tail2 != null)tail2.next =head2;
        else head =head2;
        
        while(head2.next!=null){
              head2=head2.next;
        }
        head2.next=head3;
        return head;
    }
}