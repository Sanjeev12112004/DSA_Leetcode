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
    public static int CalcGCD(int a, int b){
        if(b==0) return a;
        return CalcGCD(b,a%b);
    }
    public ListNode insertGreatestCommonDivisors(ListNode head) {
        ListNode ptr1=head;
        ListNode ptr2=head.next;

        while(ptr1!=null &&ptr2!=null){
            int gcd=CalcGCD(ptr1.val,ptr2.val);
            ptr1.next=new ListNode(gcd);
            ptr1=ptr1.next;
            ptr1.next=ptr2;

            ptr2=ptr2.next;
            ptr1=ptr1.next;
        }
        return head;
    }
}