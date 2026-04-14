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
    public ListNode reverseKGroup(ListNode head, int k) {
        ArrayList<Integer> list= new ArrayList<>();
        ListNode temp=head;
        while(temp!=null){
            list.add(temp.val);
            temp=temp.next;
        }
        for(int i=0;i<list.size();i=i+k){
           int start=i;
           int end=i+k-1;
           if(end<=list.size()-1){
                while(start<end){
                    int t = list.get(start);
                    list.set(start, list.get(end));
                    list.set(end, t);
                    start++;
                    end--;
                }
            }
        }
        int i=0;
        ListNode ptr=head;
        while(ptr!=null){
            ptr.val=list.get(i++);
            ptr=ptr.next;
        }
        return head;
    }
}