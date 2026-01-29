class Solution {
    static int dir[][]= new int [][]{{0,-1},{-1,0},{0,1},{1,0}};
    static class Pair{
        int row;
        int col;
        int t;
        public Pair(int r, int c, int t){
            this.row=r;
            this.col=c;
            this.t=t;
        }
    }
    public static boolean isValidCell(int nr, int nc, int rows, int cols){
        if(nr>=0 && nr<rows && nc>=0 && nc<cols){
            return true;
        }
        return false;
    }
    public int orangesRotting(int[][] grid) {
        int m=grid.length;
        int n=grid[0].length;

        int freshOr=0;

        Queue<Pair> q= new LinkedList<>();
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(grid[i][j]==2){
                    q.add(new Pair(i,j,0));
                }
                if(grid[i][j]==1){
                      freshOr++;
                }
            }
        }
        int minTime=0;

        while(!q.isEmpty()){
            Pair curr= q.remove();

            for(int direction[] : dir){
                int nr=curr.row +direction[0];
                int nc=curr.col +direction[1];

                if(isValidCell(nr,nc,m,n) && grid[nr][nc]==1){
                    q.add(new Pair(nr,nc,curr.t+1));
                    grid[nr][nc]=2;
                     minTime=curr.t+1;
                    freshOr--;
                }
            }
        }
        return freshOr==0?minTime:-1;
    }
}