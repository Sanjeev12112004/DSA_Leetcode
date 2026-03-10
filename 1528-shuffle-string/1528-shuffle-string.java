class Solution {
    static class Pair implements Comparable<Pair>{
        char ch;
        int idx;
        public Pair(char ch,int idx){
            this.ch=ch;
            this.idx=idx;
        }

        public int compareTo(Pair p2){
            return this.idx-p2.idx;
        }
    }
    public String restoreString(String s, int[] indices) {
        PriorityQueue<Pair> pq= new PriorityQueue<>();
        for(int i=0;i<indices.length;i++){
            pq.add(new Pair(s.charAt(i),indices[i]));
        }
        StringBuilder sb=new StringBuilder("");
        while(!pq.isEmpty()){
            Pair curr=pq.remove();
            sb.append(curr.ch);
        }
        return sb.toString();
    }
}