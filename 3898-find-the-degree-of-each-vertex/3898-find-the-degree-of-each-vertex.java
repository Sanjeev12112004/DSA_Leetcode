class Solution {
    public int[] findDegrees(int[][] matrix) {
        int result[]=new int[matrix[0].length];
        int count=0;
        for(int i=0;i<matrix.length;i++){
            count=0;
            for(int j=0;j<matrix[0].length;j++){
                    count+=matrix[i][j];
            }
            result[i]=count;
        }
        return result;
    }
}