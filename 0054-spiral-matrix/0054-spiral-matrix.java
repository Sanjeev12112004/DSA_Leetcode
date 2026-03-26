class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> list= new ArrayList<>();
        int sr=0;
        int sc=0;
        int er=matrix.length-1;
        int ec=matrix[0].length-1;

        while(sr<=er && sc<=ec){

            for(int j=sc;j<=ec;j++){
                list.add(matrix[sr][j]);
            }
            sr++;

            for(int i=sr;i<=er;i++){
                list.add(matrix[i][ec]);
            }
            ec--;

            for(int j=ec;j>=sc;j--){
               if(sr>er) break;
                list.add(matrix[er][j]);
            }
            er--;;

            for(int i=er;i>=sr;i--){
               if(sc>ec) break;
                list.add(matrix[i][sc]);
            }
            sc++;
        }
        return list;
    }
}