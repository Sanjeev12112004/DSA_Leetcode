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
    public ListNode removeNodes(ListNode head) {
        ArrayList<Integer> list= new ArrayList<>();
        ListNode temp=head;
        while(temp!=null){
            list.add(temp.val);
            temp=temp.next;
        }
        for(int i=list.size()-1;i>=1;i--){
            if(list.get(i)>list.get(i-1)){
                list.remove(i-1);
            }
        }
        ListNode ptr=head;
        for(int i=0;i<list.size();i++){
            ptr.val=list.get(i);
            if(i<list.size()-1){
              ptr=ptr.next;
            }
        }
        ptr.next=null;
        return head;
    }
}