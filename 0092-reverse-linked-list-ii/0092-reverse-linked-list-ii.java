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
    public static void ReverseRange(int arr[], int s, int e){
        int lp=s-1;
        int rp=e-1;

        while(lp<rp){
            int temp=arr[lp];
            arr[lp]=arr[rp];
            arr[rp]=temp;

            lp++;
            rp--;
        }
    }
    public ListNode reverseBetween(ListNode head, int left, int right) {
        ListNode temp=head;
        int n=0;
        while(temp!=null){
            n++;
            temp=temp.next;
        }
        int arr[]= new int[n];
        int ptr=0;
        ListNode temp2=head;
        while(temp2!=null){
            arr[ptr++]=temp2.val;
            temp2=temp2.next;
        }

        ReverseRange(arr,left,right);
        ListNode temp3=head;
        int p=0;
        while(temp3!=null){
             temp3.val=arr[p++];
             temp3=temp3.next;
        }
        return head;
    }
}