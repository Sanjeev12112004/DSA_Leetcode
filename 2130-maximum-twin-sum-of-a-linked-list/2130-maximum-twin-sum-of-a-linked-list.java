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
    public int pairSum(ListNode head) {
       ArrayList<Integer> arr= new ArrayList<>();
       ListNode temp=head;
        while(temp!=null){
         arr.add(temp.val);
         temp=temp.next;
        }

        int max=Integer.MIN_VALUE;
        int ptr1=0;
        int ptr2=arr.size()-1;
        while(ptr1<ptr2){
            max=Math.max(max,(arr.get(ptr1)+arr.get(ptr2)));
            ptr1++;
            ptr2--;
        }
        return max;
    }
}