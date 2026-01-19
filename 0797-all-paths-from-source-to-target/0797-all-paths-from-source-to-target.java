import java.util.*;
class Solution {
    static class Edge{
        int src;
        int dst;
        public Edge(int s,int d){
            this.src=s;
            this.dst=d;
        }
    }
    public static void CreateGraph(ArrayList<Edge> graph[], int [][]graph2){
        for(int i=0;i<graph.length;i++){
            graph[i]= new ArrayList<>();
        }
         for (int i = 0; i < graph2.length; i++) {
            for (int j = 0; j < graph2[i].length; j++) {
                int a= graph2[i][j];
                graph[i].add(new Edge(i, a));
            }
        }
    }

    public static void AllPaths(ArrayList<Edge> graph[],int src,int dst, List<List<Integer>> result ,ArrayList<Integer> path ){

        path.add(src);
        if(src==dst){
           result.add(new ArrayList<>(path));
           path.remove(path.size()-1);
           return;
        }
        for(int i=0;i<graph[src].size();i++){
            Edge e= graph[src].get(i);
            AllPaths(graph,e.dst,dst,result, path);
        }
        path.remove(path.size()-1);
    }
    public List<List<Integer>> allPathsSourceTarget(int[][] graph2) {
        ArrayList<Edge> graph[]= new ArrayList[graph2.length];
        CreateGraph(graph,graph2);
        
        List<List<Integer>> result= new ArrayList<>();
        AllPaths(graph,0,graph2.length-1,result, new ArrayList<>());
        return result;
    }
}