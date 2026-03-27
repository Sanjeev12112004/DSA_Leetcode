class Solution {
    public int[][] generateMatrix(int n) {
         int arr[][]= new int[n][n];
         int num=1;
         int sr=0;
         int sc=0;
         int er=arr.length-1;
         int ec=arr[0].length-1;

         while(sr<=er && sc<=ec){

              for(int j=sc;j<=ec;j++){
                 arr[sr][j]=num++;
              }
              sr++;

              for(int i=sr;i<=er;i++){
                 arr[i][ec]=num++;
              }
              ec--;

              for(int j=ec;j>=sc;j--){
                 arr[er][j]=num++;
              }
              er--;

              for(int i=er; i>=sr;i--){
                arr[i][sc]=num++;
              }
              sc++;
         }
         return arr;
    }
}