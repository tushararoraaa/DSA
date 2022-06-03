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

    public static int[] bellman(int V, ArrayList<ArrayList<pair2>> adj) {
        int[] dist = new int[V];
        dist[0] = 0;
        for (int i = 1; i < V; i++) {
            dist[i] = (int)1e9;
        }
        for (int i = 0; i < V - 1; i++) {

            for (int j = 0; j < V; j++) {

                for (pair2 x : adj.get(j)) {
                    int u = j;
                    int v = x.node;
                    int weight = x.weight;

                    if (dist[u] + weight < dist[v]) {
                        dist[v] = dist[u] + weight;
                    }
                }

            }
        }

        int flag = 0;

        for (int j = 0; j < V; j++) {

            for (pair2 x : adj.get(j)) {
                int u = j;
                int v = x.node;
                int weight = x.weight;

                if (dist[u] + weight < dist[v]) {
                    flag = 1;
                    break;
                }
            }

        }

        if (flag == 1) {
            System.out.println("Negative Cycle");
            return new int[1];
        } else {

            return dist;
        }

    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        ArrayList<ArrayList<pair2>> graph = new ArrayList<ArrayList<pair2>>();
        for (int i = 0; i < n; i++) {
            graph.add(new ArrayList<pair2>());
        }
        addEdge(graph, 0, 1, 5);
        addEdge(graph, 1, 2, -2);
        addEdge(graph, 1, 5, -3);
        addEdge(graph, 2, 4, 3);
        addEdge(graph, 5, 3, 1);
        addEdge(graph, 3, 2, 6);
        addEdge(graph, 3, 4, -2);

        int[] ans = bellman(n, graph);
        for (int i = 0; i < ans.length; i++) {
            System.out.print(ans[i] + " ");
        }

    }
}
