import java.util.*;

class Edge {
    int src, dest, weight;

    Edge(int s, int d, int w) {
        src = s;
        dest = d;
        weight = w;
    }
}

public class BellmanFord {

    public static void main(String[] args) {

        int V = 5;

        ArrayList<Edge> edges = new ArrayList<>();

        edges.add(new Edge(0, 1, 6));
        edges.add(new Edge(0, 2, 7));
        edges.add(new Edge(1, 2, 8));
        edges.add(new Edge(1, 3, 5));
        edges.add(new Edge(1, 4, -4));
        edges.add(new Edge(2, 3, -3));
        edges.add(new Edge(2, 4, 9));
        edges.add(new Edge(3, 1, -2));
        edges.add(new Edge(4, 0, 2));
        edges.add(new Edge(4, 3, 7));

        int[] dist = new int[V];
        Arrays.fill(dist, Integer.MAX_VALUE);

        dist[0] = 0;

        for (int i = 1; i < V; i++) {

            for (Edge e : edges) {

                if (dist[e.src] != Integer.MAX_VALUE &&
                        dist[e.src] + e.weight < dist[e.dest]) {

                    dist[e.dest] = dist[e.src] + e.weight;
                }
            }
        }

        boolean negativeCycle = false;

        for (Edge e : edges) {

            if (dist[e.src] != Integer.MAX_VALUE &&
                    dist[e.src] + e.weight < dist[e.dest]) {

                negativeCycle = true;
                break;
            }
        }

        if (negativeCycle)
            System.out.println("Negative Weight Cycle Found");
        else
            System.out.println(Arrays.toString(dist));
    }
}