import java.util.*;

//Topological Sorting for a graph is not possible if the graph is not a DAG(Directed Acyclic Graph)

public class Main {

    public static class pair {
        int node;
        int parent;

        pair(int node, int parent) {
            this.node = node;
            this.parent = parent;
        }
    }

    public static void addEdge(ArrayList<ArrayList<Integer>> graph, int u, int v) {
        graph.get(u).add(v);
    }

    static Stack<Integer> st = new Stack<>();

    // Function to return list containing vertices in Topological order.

    static void dfs(int node, ArrayList<ArrayList<Integer>> adj, boolean[] vis) {
        vis[node] = true;

        for (Integer x : adj.get(node)) {
            if (!vis[x]) {
                dfs(x, adj, vis);
            }
        }
        st.push(node);
    }

    static void dfs_traversal(int node, ArrayList<ArrayList<Integer>> adj, boolean[] vis) {
        vis[node] = true;
        System.out.print(node + " ");
        for (Integer x : adj.get(node)) {
            if (!vis[x]) {
                dfs_traversal(x, adj, vis);
            }
        }

    }

    static void kosaraju(int V, ArrayList<ArrayList<Integer>> adj) {

        // STEP 1 GET TOPOLOGICAL SORT STACK

        st.clear();
        boolean[] vis = new boolean[V];
        for (int i = 0; i < V; i++) {
            if (!vis[i]) {
                dfs(i, adj, vis);
            }
        }

       

        // STEP 2 TRANSPOSE THE GRAPH

        ArrayList<ArrayList<Integer>> transpose = new ArrayList<ArrayList<Integer>>();

        for (int i = 0; i < V; i++) {
            transpose.add(new ArrayList<Integer>());
        }
        for (int i = 0; i < V; i++) {
            vis[i] = false; // as toplogical sorting made visited array true hence we made it false again

            for (Integer x : adj.get(i)) {
                transpose.get(x).add(i);
            }
        }

        // STEP 3 AGAIN DO DFS ON THE STACK POPPED ELEMENTS

        while (st.size() > 0) {
            int node = st.pop();
            if (vis[node] == false) {
                System.out.print("SCC:");
                dfs_traversal(node, transpose, vis);
                System.out.println();
            }
        }

    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        ArrayList<ArrayList<Integer>> graph = new ArrayList<ArrayList<Integer>>();
        for (int i = 0; i < n; i++) {
            graph.add(new ArrayList<Integer>());
        }
        addEdge(graph, 0, 1);
        addEdge(graph, 1, 2);
        addEdge(graph, 2, 0);
        addEdge(graph, 1, 3);
        addEdge(graph, 3, 4);

        kosaraju(n, graph);

    }
}
