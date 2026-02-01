class Solution {
    static int dir[][]= new int[][]{{0,-1},{-1,0},{0,1},{1,0}};
    public static void dfs(int row, int col, int vis[][], int [][]grid){
        vis[row][col]=1;
        for(int direction[]: dir){
            int nr= row+direction[0];
            int nc= col+direction[1];

            if(nr>=0 && nr<grid.length && nc>=0 && nc<grid[0].length && vis[nr][nc]==0 && 
            grid[nr][nc]==1) {
                dfs(nr,nc,vis,grid);
            }
        }
    }
    public int numEnclaves(int[][] grid) {
        int vis[][]= new int[grid.length][grid[0].length];
        //row traverse
        for(int j=0;j<grid[0].length;j++){
            //1st row
            if(vis[0][j]==0 && grid[0][j]==1){
                dfs(0,j,vis,grid);
            }
            //last row
            if(vis[grid.length-1][j]==0 && grid[grid.length-1][j]==1){
                dfs(grid.length-1,j,vis,grid);
            }
        }

        //column traverse
        for(int i=0;i<grid.length;i++){
            //1 column
            if(vis[i][0]==0 && grid[i][0]==1){
                dfs(i,0,vis,grid);
            }
            //last column
            if(vis[i][grid[0].length-1]==0 && grid[i][grid[0].length-1]==1){
                dfs(i,grid[0].length-1,vis,grid);
            }
        }
        int count=0;
        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[0].length;j++){
                if(grid[i][j]==1 && vis[i][j]==0){
                    count++;
                }
            }
        }
        return count;
    }
}