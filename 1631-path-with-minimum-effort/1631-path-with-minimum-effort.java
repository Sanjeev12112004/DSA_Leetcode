class Solution {
    static int dir[][]= new int[][]{{0,-1},{1,0},{0,1},{-1,0}};
    static class Pair implements Comparable<Pair>{
        int diff;
        int row;
        int col;
        public Pair(int d,int r, int c){
            this.diff=d;
            this.row=r;
            this.col=c;
        }
        @Override
        public int compareTo(Pair p2){
            return this.diff-p2.diff;
        }
    }
    public static boolean isValid(int nr,int nc, int row, int col){
        if(nr>=0 && nr<row&& nc>=0 && nc<col){
            return true;
        }

        return false;
    }
    public int minimumEffortPath(int[][] heights) {
        int dist[][]= new int[heights.length][heights[0].length];
        for(int i=0;i<dist.length;i++){
            for(int j=0;j<dist[0].length;j++){
                dist[i][j]=Integer.MAX_VALUE;
            }
        }
        dist[0][0]=0;
        PriorityQueue<Pair> pq= new PriorityQueue<>();
        pq.add(new Pair(0,0,0));
        while(pq.size()!=0){
            Pair curr=pq.remove();

            int diff=curr.diff;
            int row=curr.row;
            int col=curr.col;

            if(row==heights.length-1 && col==heights[0].length-1){
                return diff;
            }

            

            for(int direction[]: dir){
                int nr=row+direction[0];
                int nc=col+direction[1];
                
                if(isValid(nr,nc,heights.length,heights[0].length)){
                    int neweffort=Math.max(Math.abs(heights[row][col]-heights[nr][nc]),diff);
                    if(neweffort<dist[nr][nc]){
                        dist[nr][nc]=neweffort;
                        pq.add(new Pair(neweffort,nr,nc));
                    }
                }
            }
        }
        return 0;
    }
}