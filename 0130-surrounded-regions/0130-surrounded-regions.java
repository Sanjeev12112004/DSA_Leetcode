class Solution {
    static int dir[][]= new int[][]{{0,-1},{-1,0},{0,1},{1,0}};
    public static void dfs(int row, int col, int vis[][], char board[][]){
        vis[row][col]=1;
        for(int direction[] : dir){
            int nr= row+direction[0];
            int nc= col+direction[1];

            if(nr>=0 && nr<board.length && nc>=0 && nc<board[0].length && vis[nr][nc]==0 &&
             board[nr][nc] =='O'){
               dfs(nr,nc,vis,board);
            }
        }
    }
    public void solve(char[][] board) {
        int vis[][]= new int[board.length][board[0].length];

        //trversing rows(ist and last)
        for(int j=0;j<board[0].length;j++){
            //first row
            if(vis[0][j]==0 && board[0][j]=='O'){
                dfs(0,j,vis,board);
            }
            //last row
            if(vis[board.length-1][j]==0 && board[board.length-1][j]=='O'){
                dfs(board.length-1,j,vis,board);
            }
        }
        // traversing columns
        for(int i=0;i<board.length;i++){
             //first col
            if(vis[i][0]==0 && board[i][0]=='O'){
                dfs(i,0,vis,board);
            }
            //last col
            if(vis[i][board[0].length-1]==0 && board[i][board[0].length-1]=='O'){
                dfs(i,board[0].length-1,vis,board);
            }
        }

        for(int i=0;i<board.length;i++){
            for(int j=0;j<board[0].length;j++){
                if(board[i][j]=='O' && vis[i][j]==0){
                    board[i][j]='X';
                }
            }
        }
    }
}