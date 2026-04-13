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
    public ListNode doubleIt(ListNode head) {
        ListNode prev=null;
        ListNode curr=head;
        ListNode next;
        while(curr!=null){
            next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
        }
        head=prev;
        
        ListNode temp=head;
        ListNode left=null;
        int carry=0;
        while(temp!=null){
            int val=temp.val*2+carry;
            if(val>9){
               temp.val=val%10;
               carry=val/10;
            }
            else{
                temp.val=val;
                carry=0;
            }
            left=temp;
            temp=temp.next;
        }
        if(carry!=0){
           left.next=new ListNode(carry);
        }

        ListNode prev2=null;
        ListNode curr2=head;
        ListNode next2;
        while(curr2!=null){
            next2=curr2.next;
            curr2.next=prev2;
            prev2=curr2;
            curr2=next2;
        }
        head=prev2;
        return head;
    }
}