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
    public int[] nextLargerNodes(ListNode head) {
       ArrayList<Integer> list= new ArrayList<>();
       ListNode ptr1=head;

       while(ptr1!=null){
          ListNode ptr2=ptr1.next;
          int n=-1;
          while(ptr2!=null){
               if(ptr2.val>ptr1.val){
                  n=ptr2.val;
                  break;
               }
               ptr2=ptr2.next;
            }
          if(n!=-1){
            list.add(n);
          }
          else{
            list.add(0);
          }
          ptr1=ptr1.next;
       }
       int arr[]=new int[list.size()];
       for(int i=0;i<arr.length;i++){
           arr[i]=list.get(i);
       }
       return arr;
    }
}