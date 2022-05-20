import java.util.*;

public class Main {

    public static class Edge {
        int src;
        int dest;
        int wt;

        Edge(int src, int dest, int wt) {
            this.src = src;
            this.dest = dest;
            this.wt = wt;
        }
    }

    public static void addEdge(ArrayList<ArrayList<Integer>> graph, int u, int v) {
        graph.get(u).add(v);
        graph.get(v).add(u);
    }

    public static ArrayList<Integer> bfsOfGraph(int V, ArrayList<ArrayList<Integer>> adj) {
        // Code here
        ArrayList<Integer> ans = new ArrayList<>();

        int[] vis = new int[V];

        for (int i = 0; i < V; i++) { // FOR loop to print all components of graphs
            if (vis[i] == 0) {
                Queue<Integer> q = new LinkedList<>();
                q.add(i);
                vis[i] = 1;

                while (q.size() > 0) {
                    Integer top = q.poll();
                    ans.add(top);

                    for (Integer x : adj.get(top)) {
                        if (vis[x] == 0) {
                            q.add(x);
                            vis[x] = 1;
                        }
                    }

                }
            }
        }

        return ans;

    }

    public static ArrayList<Integer> bfs(int V, ArrayList<ArrayList<Integer>> adj) { // WITHOUT FOR LOOP
        // Code here
        ArrayList<Integer> ans = new ArrayList<>();

        int[] vis = new int[V];

        Queue<Integer> q = new LinkedList<>();
        q.add(0);
        vis[0] = 1;

        while (q.size() > 0) {
            Integer top = q.poll();
            ans.add(top);

            for (Integer x : adj.get(top)) { // HERE WE ARE GETTING ADJACENT NODES FROM ADJACENCY LIST
                if (vis[x] == 0) {
                    q.add(x);
                    vis[x] = 1;
                }
            }

        }

        return ans;

    }

    public static void DFS_helper(int V, ArrayList<ArrayList<Integer>> adj, int i, boolean[] vis,
            ArrayList<Integer> ans) {
        vis[i] = true;
        ans.add(i);

        for (Integer x : adj.get(i)) { // Here we are getting all edges connected
            if (vis[x] == false) {
                DFS_helper(V, adj, x, vis, ans); // HERE WE ARE CALLING RECURSIVELY AS WE HAVE TO GO IN DEPTH
            }
        }
    }

    public static ArrayList<Integer> DFS(int V, ArrayList<ArrayList<Integer>> adj) {
        ArrayList<Integer> ans = new ArrayList<Integer>();

        boolean[] vis = new boolean[V];
        DFS_helper(V, adj, 0, vis, ans);

        return ans;
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        ArrayList<ArrayList<Integer>> graph = new ArrayList<ArrayList<Integer>>();
        for (int i = 0; i < n; i++) {
            graph.add(new ArrayList<Integer>());
        }
        addEdge(graph, 0, 1);
        addEdge(graph, 0, 3);
        addEdge(graph, 1, 2);
        addEdge(graph, 2, 3);
        addEdge(graph, 3, 4);
        addEdge(graph, 4, 5);
        addEdge(graph, 4, 6);
        addEdge(graph, 5, 6);

        ArrayList<Integer> ans = bfsOfGraph(n, graph);
        ArrayList<Integer> ans2 = bfs(n, graph);
        System.out.println("BFS " + ans);
        // System.out.println(ans2);
        ArrayList<Integer> dfs = DFS(n, graph);
        System.out.println("DFS " + dfs);

    }
}
