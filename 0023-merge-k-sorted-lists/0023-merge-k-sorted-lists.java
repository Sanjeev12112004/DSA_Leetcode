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
import java.util.*;
class Solution {
    public ListNode mergeKLists(ListNode[] lists) {
        ArrayList<Integer> arr= new ArrayList<>();
        for(int i=0;i<lists.length;i++){
            ListNode temphead=lists[i];
            while(temphead!=null){
                arr.add(temphead.val);
                temphead=temphead.next;
            }
        }
        Collections.sort(arr);
        ListNode head= new ListNode(-100000);
        ListNode ptr=head;
        for(int i=0;i<arr.size();i++){
            if(ptr.next==null){
                ptr.next=new ListNode(arr.get(i));
                ptr=ptr.next;
            }
        }
        ptr.next=null;
        return head.next;
    }
}