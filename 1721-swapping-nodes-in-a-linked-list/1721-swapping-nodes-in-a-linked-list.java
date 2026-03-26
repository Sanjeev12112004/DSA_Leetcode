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
    public ListNode swapNodes(ListNode head, int k) {
        int length=0;
        ListNode temp=head;
        while(temp!=null){
            length++;
            temp=temp.next;
        }
        int start1=1;
        ListNode startTemp1=head;
        while(start1<k){
            startTemp1=startTemp1.next;
            start1++;
        }
        int k2=length-k+1;
        int start2=1;
        ListNode startTemp2=head;
        while(start2<k2){
            startTemp2=startTemp2.next;
            start2++;
        }
        int copy=startTemp1.val;
        startTemp1.val=startTemp2.val;
        startTemp2.val=copy;
        return head;
    }
}