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
    public int getDecimalValue(ListNode head) {
        ListNode temp=head;
        StringBuilder sb= new StringBuilder("");
        while(temp!=null){
            String n=Integer.toString(temp.val);
            sb.append(n);
            temp=temp.next;
        }
        //String s=sb.toString();
        return Integer.parseInt(sb.toString(),2);
    }
}