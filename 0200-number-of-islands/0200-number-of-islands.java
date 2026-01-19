import java.util.*;

class Solution {

    static class Edge {
        int src;
        int dst;

        public Edge(int s, int d) {
            this.src = s;
            this.dst = d;
        }
    }

    public static void CreateGraph(ArrayList<Edge>[] graph, char[][] grid) {
        int n = grid.length;
        int m = grid[0].length;

        for (int i = 0; i < graph.length; i++) {
            graph[i] = new ArrayList<>();
        }

        int[][] dir = { { -1, 0 }, { 1, 0 }, { 0, -1 }, { 0, 1 } };

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {

                if (grid[i][j] == '1') {
                    int src = i * m + j;

                    for (int k = 0; k < 4; k++) {
                        int ni = i + dir[k][0];
                        int nj = j + dir[k][1];

                        if (ni >= 0 && nj >= 0 && ni < n && nj < m && grid[ni][nj] == '1') {
                            int dst = ni * m + nj;
                            graph[src].add(new Edge(src, dst));
                        }
                    }
                }
            }
        }
    }

    public static void Count_Util(ArrayList<Edge>[] graph, int curr, boolean[] visit) {
        visit[curr] = true;

        for (int i = 0; i < graph[curr].size(); i++) {
            Edge e = graph[curr].get(i);
            if (!visit[e.dst]) {
                Count_Util(graph, e.dst, visit);
            }
        }
    }

    public int numIslands(char[][] grid) {
        int n = grid.length;
        int m = grid[0].length;

        ArrayList<Edge>[] graph = new ArrayList[n * m];
        CreateGraph(graph, grid);

        boolean[] visit = new boolean[n * m];
        int count = 0;

        
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (grid[i][j] == '1') {
                    int node = i * m + j;
                    if (!visit[node]) {
                        count++;
                        Count_Util(graph, node, visit);
                    }
                }
            }
        }
        return count;
    }
}
