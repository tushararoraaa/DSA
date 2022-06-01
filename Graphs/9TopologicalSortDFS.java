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
        graph.get(v).add(u);
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

    static int[] topoSort(int V, ArrayList<ArrayList<Integer>> adj) {
        // add your code here
        st.clear();
        boolean[] vis = new boolean[V];
        for (int i = 0; i < V; i++) {
            if (!vis[i]) {
                dfs(i, adj, vis);
            }
        }
        int[] res = new int[V];
        int i = 0;
        while (st.size() > 0) {
            res[i++] = st.pop();
        }

        return res;
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

        // boolean ans = isCyclic(n, graph);
        // System.out.println(ans);

        int[] ans = topoSort(n,graph);
        for(int i = 0; i<n;i++;){
            System.out.print(ans[i]+" ");
        }

    }
}
