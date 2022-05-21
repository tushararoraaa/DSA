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

    public static boolean check(int n, ArrayList<ArrayList<Integer>> graph, int i, int[] color) {
        Queue<Integer> q = new LinkedList<>();

        q.add(i);
        color[i] = 0;

        while (q.size() > 0) {

            int top = q.poll();

            for (Integer x : graph.get(top)) {
                int ctop = color[top];
                if (color[x] == -1) {
                    color[x] = 1 - ctop; // filling it with opposite color
                    q.add(x);
                } else if (color[x] == color[top]) { // if color matches with adjacent node then it is not a bipartite
                                                     // graph
                    return false;
                }

            }
        }

        return true;
    }

    public static boolean isBipartite(ArrayList<ArrayList<Integer>> graph, int n) {
        int[] color = new int[n];
        Arrays.fill(color, -1);

        for (int i = 0; i < n; i++) {
            if (color[i] == -1) {
                if (!check(n, graph, i, color)) {
                    return false;
                }
            }

        }
        return true;
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

        boolean ans = isBipartite(graph, n);
        System.out.println(ans);
    }
}
