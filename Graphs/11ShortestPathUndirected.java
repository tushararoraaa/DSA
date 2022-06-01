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



    public static int shortest(ArrayList<ArrayList<Integer>> adj, int V, int src, int dest) {
        int[] dist = new int[V];
        for (int i = 0; i < dist.length; i++) {
            dist[i] = Integer.MAX_VALUE;
        }

        Queue<Integer> q = new LinkedList<>();
        q.add(src);
        dist[src] = 0;

        while (q.size() > 0) {
            int top = q.poll();
            for (Integer x : adj.get(top)) {
                if (1 + dist[top] < dist[x]) {
                    
                    dist[x] = 1 + dist[top];
                    q.add(x);
                }
            }
        }

        return dist[dest];
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
        addEdge(graph, 1, 3);
        addEdge(graph, 2, 6);
        addEdge(graph, 3, 4);
        addEdge(graph, 4, 5);
        addEdge(graph, 5, 6);
        addEdge(graph, 6, 7);
        addEdge(graph, 6, 8);
        addEdge(graph, 7, 8);

        // addEdge(graph, 0, 1);
        // addEdge(graph, 1, 2);

        // boolean ans = isCyclic(n, graph);
        // System.out.println(ans);

        // int[] ans = topoSort(n,graph);
        // for(int i = 0; i<n;i++;){
        // System.out.print(ans[i]+" ");
        // }

        int ans = shortest(graph, n, 0, 6);
        System.out.print(ans);
        System.out.print(aL);
        

    }
}
