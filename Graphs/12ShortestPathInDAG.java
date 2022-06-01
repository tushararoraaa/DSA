import java.util.*;

//Topological Sorting for a graph is not possible if the graph is not a DAG(Directed Acyclic Graph)

//HERE WE HAVE CREATED WEIGHTED DIRECTED GRAPH USING PAIR2 CLASS
//ARRAYLIST OF ARRAYLIST OF PAIRS

public class Main {

    public static class pair {
        int node;
        int parent;

        pair(int node, int parent) {
            this.node = node;
            this.parent = parent;
        }
    }

    public static class pair2 {
        int node;
        int weight;

        pair2(int node, int weight) {
            this.node = node;
            this.weight = weight;
        }
    }

    public static void addEdge(ArrayList<ArrayList<pair2>> graph, int u, int v, int weight) {
        graph.get(u).add(new pair2(v, weight));
    }

    public static Stack<Integer> st = new Stack<>();

    public static void TopoStack(int node, ArrayList<ArrayList<pair2>> adj, boolean[] vis) { // IT'LL RETURN STACK OF
                                                                                             // TOPOLOGICAL SORT
        vis[node] = true;

        for (pair2 x : adj.get(node)) {
            if (!vis[x.node]) {
                TopoStack(x.node, adj, vis);
            }
        }

        st.add(node);
    }

    public static int[] shortest(int V, ArrayList<ArrayList<pair2>> adj) {
        st.clear();
        boolean[] vis = new boolean[V];
        for (int i = 0; i < V; i++) {
            if (!vis[i]) {
                TopoStack(i, adj, vis);
            }
        }
        int[] dist = new int[V];
        for (int i = 0; i < dist.length; i++) {
            dist[i] = Integer.MAX_VALUE;
        }

        dist[0] = 0;

        while (st.size() > 0) {
            int top = st.pop();

            for (pair2 x : adj.get(top)) {
                int child = x.node;
                int childWeight = x.weight;

                dist[child] = Math.min(dist[child], dist[top] + childWeight);

            }
        }

        return dist;

    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        ArrayList<ArrayList<pair2>> graph = new ArrayList<ArrayList<pair2>>();
        for (int i = 0; i < n; i++) {
            graph.add(new ArrayList<pair2>());
        }
        addEdge(graph, 0, 1, 2);
        addEdge(graph, 0, 4, 1);
        addEdge(graph, 1, 2, 3);
        addEdge(graph, 2, 3, 6);
        addEdge(graph, 4, 2, 2);
        addEdge(graph, 4, 5, 4);
        addEdge(graph, 5, 3, 1);

        // addEdge(graph, 0, 1);
        // addEdge(graph, 1, 2);

        // boolean ans = isCyclic(n, graph);
        // System.out.println(ans);

        // int[] ans = topoSort(n,graph);
        // for(int i = 0; i<n;i++;){
        // System.out.print(ans[i]+" ");
        // }

        for (int i = 0; i < n; i++) {
            System.out.print(i + "-->");
            for (pair2 x : graph.get(i)) {
                System.out.print("(" + x.node + "," + x.weight + "),");
            }
            System.out.println();
        }

        int[] ans = shortest(n, graph);
        for (int i = 0; i < ans.length; i++) {
            System.out.print(ans[i] + " ");
        }

    }
}
