class Solution {
    static int [][]dir= new int[][]{{0,-1},{-1,0},{0,1},{1,0}};
    static class Pair{
        int row;
        int col;
        int minD;
        public Pair(int i, int j, int d){
            this.row=i;
            this.col=j;
            this.minD=d;
        }
    }
    public static boolean isValid(int nr, int nc, int n, int m){
        if(nr>=0 && nr<n && nc>=0 && nc<m){
            return true;
        }
        return false;
    }
    public int[][] updateMatrix(int[][] mat) {
        int vis[][]= new int[mat.length][mat[0].length];
        int dist[][]= new int[mat.length][mat[0].length];
        for(int i=0;i<mat.length;i++){
            Arrays.fill(vis[i],1);
        }

        Queue<Pair> q= new LinkedList<>();
        for(int i=0;i<mat.length;i++){
            for(int j=0;j<mat[0].length;j++){
                if(mat[i][j]==0){
                   q.add(new Pair(i,j,0)); // initial 0 ka dist 0 sa -> 0 hi hoga
                   vis[i][j]=0;
                }
            }
        }

        while(!q.isEmpty()){
            Pair curr= q.remove();
            
            dist[curr.row][curr.col]=curr.minD;
            

            for(int direction[]: dir){
                int nr= curr.row+ direction[0];
                int nc= curr.col+ direction[1];

                if(isValid(nr,nc,mat.length,mat[0].length) && mat[nr][nc]==1 && vis[nr][nc]==1){
                    q.add(new Pair(nr,nc,curr.minD+1));
                    vis[nr][nc]=0;
                }
            }
        }
        return dist;
    }
}