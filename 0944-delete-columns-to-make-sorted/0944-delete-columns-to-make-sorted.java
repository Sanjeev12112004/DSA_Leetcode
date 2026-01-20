class Solution {
    public static void CreateMatrix(char[][] matrix, String strs[]){
        for(int i=0;i<matrix.length;i++){
            String s=strs[i];
            for(int j=0;j<matrix[0].length;j++){
                matrix[i][j]=s.charAt(j);
            }
        }
    }
    public int minDeletionSize(String[] strs) {
        
        char matrix[][]= new char[strs.length][strs[0].length()];
        CreateMatrix(matrix,strs);

        int delete=0;
        for(int j=0;j<matrix[0].length;j++){
            for(int i=0;i<matrix.length-1;i++){
                   if((int)matrix[i][j]>(int)matrix[i+1][j]){
                      delete++;
                      break;
                   }
            }
        }
        return delete;
    }
}