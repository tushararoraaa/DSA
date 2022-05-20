import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static class Edge {
        int src;
        int dest;
        int wt;

        Edge(int src, int dest, int wt) {
            this.src = src;
            this.dest = dest;
            this.wt = wt;
        }
    }

    public static void addEdge(ArrayList<ArrayList<Edge>> graph, int u, int v, int wt) {
        graph.get(u).add(new Edge(u, v, wt));
        graph.get(v).add(new Edge(v, u, wt));
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        ArrayList<ArrayList<Edge>> graph = new ArrayList<ArrayList<Edge>>();
        for (int i = 0; i < n; i++) {
            graph.add(new ArrayList<Edge>());
        }
        addEdge(graph, 0, 1, 10);
        addEdge(graph, 0, 3, 10);
        addEdge(graph, 1, 2, 10);
        addEdge(graph, 2, 3, 40);
        addEdge(graph, 3, 4, 2);
        addEdge(graph, 4, 5, 2);
        addEdge(graph, 4, 6, 8);
        addEdge(graph, 5, 6, 3);

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < graph.get(i).size(); j++) {
                System.out.println(
                        graph.get(i).get(j).src + " " + graph.get(i).get(j).dest + " " + graph.get(i).get(j).wt + " ");
            }
        }
    }
}