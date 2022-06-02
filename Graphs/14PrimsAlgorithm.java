import java.util.*;

//HERE WE IMPLEMENTED A PRIORITY QUEUE LIKE WE DID IN DJIKSTRA
//HERE WE ADDED TRIPLET IN PRIORITY QUEUE having node,parent and weight
//We can get anything as per our need

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
        int node;
        int parent;
        int weight;

        pair3(int node, int parent, int weight) {
            this.node = node;
            this.parent = parent;
            this.weight = weight;
        }

        public int compareTo(pair3 o) {
            return this.weight - o.weight;
        }
    }

    public static void addEdge(ArrayList<ArrayList<pair2>> graph, int u, int v, int weight) {
        graph.get(u).add(new pair2(v, weight));
        graph.get(v).add(new pair2(u, weight));
    }

    public static int[] prims(int V, ArrayList<ArrayList<pair2>> adj) {

        boolean vis[] = new boolean[V];
        PriorityQueue<pair3> pq = new PriorityQueue<>();
        
        int[] sum = new int[V];
        pq.add(new pair3(0, -1, 0));

        while (pq.size() > 0) {
            pair3 top = pq.poll();
            if (vis[top.node] == true) {
                continue;
            }
            vis[top.node] = true;

            System.out.println(top.node + " -- " + top.parent + "--" + top.weight + " ");
            sum[top.node] = top.weight;
            for (pair2 x : adj.get(top.node)) {
                if (!vis[x.node]) {
                    pq.add(new pair3(x.node, top.node, x.weight));
                }
            }

        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        ArrayList<ArrayList<pair2>> graph = new ArrayList<ArrayList<pair2>>();
        for (int i = 0; i < n; i++) {
            graph.add(new ArrayList<pair2>());
        }
        addEdge(graph, 0, 1, 2);
        addEdge(graph, 0, 3, 6);
        addEdge(graph, 1, 3, 8);
        addEdge(graph, 1, 2, 3);
        addEdge(graph, 1, 4, 5);
        addEdge(graph, 2, 4, 7);

        // addEdge(graph, 0, 1);
        // addEdge(graph, 1, 2);

        // boolean ans = isCyclic(n, graph);
        // System.out.println(ans);

        // int[] ans = topoSort(n,graph);
        // for(int i = 0; i<n;i++;){
        // System.out.print(ans[i]+" ");
        // }

        // for (int i = 0; i < n; i++) {
        // System.out.print(i + "-->");
        // for (pair2 x : graph.get(i)) {
        // System.out.print("(" + x.node + "," + x.weight + "),");
        // }
        // System.out.println();
        // }

        int[] ans = prims(n, graph);
        for (int i = 0; i < ans.length; i++) {
            System.out.print(ans[i] + " ");
        }

    }
}
