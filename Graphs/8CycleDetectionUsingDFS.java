import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.*;

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
        graph.get(v).add(u);
    }

    public static boolean check(int node, ArrayList<ArrayList<Integer>> adj, boolean[] vis, boolean[] dfs) {
        vis[node] = true;
        dfs[node] = true;
        for (Integer x : adj.get(node)) {
            if (!vis[x]) {
                if (check(x, adj, vis, dfs)) {
                    return true;
                }
            } else if (dfs[x]) {
                return true;
            }

        }
        dfs[node] = false;

        return false;

    }

    public static boolean isCyclic(int V, ArrayList<ArrayList<Integer>> adj) {

        boolean[] vis = new boolean[V];
        boolean[] dfs = new boolean[V];

        for (int i = 0; i < V; i++) {
            if (!vis[i]) {
                if (check(i, adj, vis, dfs)) {
                    return true;
                }
            }
        }

        return false;
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        ArrayList<ArrayList<Integer>> graph = new ArrayList<ArrayList<Integer>>();
        for (int i = 0; i < n; i++) {
            graph.add(new ArrayList<Integer>());
        }
        // addEdge(graph, 0, 1);
        // addEdge(graph, 0, 3);
        // addEdge(graph, 1, 2);
        // addEdge(graph, 2, 3);
        // addEdge(graph, 3, 4);
        // addEdge(graph, 4, 5);
        // addEdge(graph, 4, 6);
        // addEdge(graph, 5, 6);

        addEdge(graph, 0, 1);
        addEdge(graph, 1, 2);

        boolean ans = isCyclic(n, graph);
        System.out.println(ans);
    }
}
