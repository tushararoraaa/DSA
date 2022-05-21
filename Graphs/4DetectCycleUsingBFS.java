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

    public static boolean detectCycle(ArrayList<ArrayList<Integer>> graph, int n) {

        boolean[] vis = new boolean[n];
        Queue<pair> q = new LinkedList<>();

        q.add(new pair(0, -1));

        while (q.size() > 0) {
            pair top = q.poll();
            vis[top.node] = true;

            for (Integer x : graph.get(top.node)) {
                if (vis[x] == false && x != top.parent) {
                    vis[x] = true;
                    q.add(new pair(x, top.node));
                } else if (vis[x] == true && x != top.parent) {
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
        addEdge(graph, 0, 1);
        addEdge(graph, 0, 3);
        addEdge(graph, 1, 2);
        addEdge(graph, 2, 3);
        addEdge(graph, 3, 4);
        addEdge(graph, 4, 5);
        addEdge(graph, 4, 6);
        addEdge(graph, 5, 6);

        // addEdge(graph, 0, 1);
        // addEdge(graph, 1, 2);

        boolean ans = detectCycle(graph, n);
        System.out.println(ans);
    }
}
