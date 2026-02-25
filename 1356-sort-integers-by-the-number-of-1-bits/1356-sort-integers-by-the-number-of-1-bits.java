class Solution {
    static class Pair implements Comparable<Pair>{
        int n;
        int f;
        public Pair(int n, int f){
            this.n=n;
            this.f=f;
        }

        public int compareTo(Pair p2){
            if(this.f==p2.f){
                return this.n-p2.n;
            }
            else{
                return this.f-p2.f;
            }
        }
    }
    public int calc(String n){
        int count=0;
        for(int i=0;i<n.length();i++){
            if(n.charAt(i)=='1') count++;
        }
        return count;
    }
    public int[] sortByBits(int[] arr) {
       PriorityQueue<Pair> pq= new PriorityQueue<>();
       for(int i=0;i<arr.length;i++){
          String n=Integer.toString(arr[i],2);
          int count=calc(n);
          pq.add(new Pair(arr[i],count));
       } 
       int ans[]=new int[arr.length];
       int j=0;
       while(!pq.isEmpty()){
           Pair curr= pq.remove();
           ans[j++]=curr.n;
       }
       return ans;
    }
}