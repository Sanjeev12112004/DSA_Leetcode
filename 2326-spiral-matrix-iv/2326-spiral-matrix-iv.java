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
    public int[][] spiralMatrix(int m, int n, ListNode head) {
        int arr[][]= new int[m][n];
        int sr=0;
        int er=m-1;
        int sc=0;
        int ec=n-1;

        while(sr<=er && sc<=ec){
           
            for(int j=sc;j<=ec;j++){
                arr[sr][j]=(head==null)?-1:head.val;
                if(head!=null){
                    head=head.next;
                }
            }
            sr++;

            for(int i=sr;i<=er;i++){
                arr[i][ec]=(head!=null)?head.val:-1;
                if(head!=null){
                    head=head.next;
                }
            }
            ec--;

            for(int j=ec;j>=sc;j--){
                if(sr>er) break;
                arr[er][j]=(head!=null)?head.val:-1;
                if(head!=null){
                    head=head.next;
                }
            }
            er--;

            for(int i=er;i>=sr;i--){
                if(sc>ec) break;
                arr[i][sc]=(head!=null)?head.val:-1;
                if(head!=null){
                    head=head.next;
                }
            }
            sc++;
        }
        return arr;
    }
}