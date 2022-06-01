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

    public static class pair3 implements Comparable<pair3> {
        int dist;
        int node;

        pair3(int dist, int node) {
            this.dist = dist;
            this.node = node;
        }

        public int compareTo(pair3 o) {
            return this.dist - o.dist;
        }
    }

    public static void addEdge(ArrayList<ArrayList<pair2>> graph, int u, int v, int weight) {
        graph.get(u).add(new pair2(v, weight));
        graph.get(v).add(new pair2(u, weight));
    }

    public static int[] shortest(int V, ArrayList<ArrayList<pair2>> adj) {
        int[] dist = new int[V];
        for (int i = 0; i < V; i++) {
            dist[i] = Integer.MAX_VALUE;
        }
        PriorityQueue<pair3> pq = new PriorityQueue<>();
        dist[1] = 0;
        pq.add(new pair3(0, 1));

        while (pq.size() > 0) {
            pair3 top = pq.poll();
            for (pair2 x : adj.get(top.node)) {
                int child = x.node;
                int childWeight = x.weight;

                if (childWeight + top.dist < dist[child]) {
                    dist[child] = childWeight + top.dist;
                    pq.add(new pair3(dist[child], child));
                }
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
        addEdge(graph, 1, 2, 2);
        addEdge(graph, 1, 4, 1);
        addEdge(graph, 2, 3, 4);
        addEdge(graph, 2, 5, 5);
        addEdge(graph, 3, 4, 3);
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
