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
    public ListNode mergeNodes(ListNode head) {
        ListNode lp=head;
        ListNode rp=head.next;

        int sum=0;
        while(rp!=null){
            if(rp.next==null){
               lp.val=sum;
               lp.next=null;
               break;
            }
            if(rp.val==0){
                lp.val=sum;
                lp.next=rp;
                sum=0;
                lp=lp.next;
            }
            sum=sum+rp.val;
            rp=rp.next;
        } 
        return head;  
    }
}