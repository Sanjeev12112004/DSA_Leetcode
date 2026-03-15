class Solution {
    public int[] countPoints(int[][] points, int[][] queries) {
      int ans[]=new int[queries.length];
      for(int i=0;i<queries.length;i++){
            int count=0;
            int x=queries[i][0];
            int y=queries[i][1];
            int r=queries[i][2];
            for(int p=0;p<points.length;p++){
                    int h=points[p][0];
                    int k=points[p][1];

                    if((x-h)*(x-h)+(y-k)*(y-k)<=r*r){
                        count++;
                    }
            }
            ans[i]=count;
        }
      return ans;
    }
}