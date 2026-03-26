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
    public ListNode mergeInBetween(ListNode list1, int a, int b, ListNode list2) {
        ListNode temp=list1;
        int p1=1;
        while(p1<a){
            temp=temp.next;
            p1++;
        }
        ListNode temp2=temp;
        while(p1<=b){
            temp2=temp2.next;
            p1++;
        }
        ListNode left=temp2.next;
        temp.next=list2;
        ListNode tempL2=list2;
        while(tempL2.next!=null){
            tempL2=tempL2.next;
        }
        tempL2.next=left;
        return list1;
    }
}