import java.util.*;

class Edge implements Comparable<Edge> {

    int src, dest, weight;

    Edge(int s, int d, int w) {
        src = s;
        dest = d;
        weight = w;
    }

    public int compareTo(Edge other) {
        return this.weight - other.weight;
    }
}

public class KruskalMST {

    static int[] parent;

    static int find(int x) {
        if (parent[x] == x)
            return x;
        return parent[x] = find(parent[x]);
    }

    static void union(int x, int y) {
        parent[find(x)] = find(y);
    }

    public static void main(String[] args) {

        int V = 4;

        parent = new int[V];

        for (int i = 0; i < V; i++)
            parent[i] = i;

        ArrayList<Edge> edges = new ArrayList<>();

        edges.add(new Edge(0, 1, 10));
        edges.add(new Edge(0, 2, 6));
        edges.add(new Edge(0, 3, 5));
        edges.add(new Edge(1, 3, 15));
        edges.add(new Edge(2, 3, 4));

        Collections.sort(edges);

        int mstWeight = 0;

        for (Edge e : edges) {

            int x = find(e.src);
            int y = find(e.dest);

            if (x != y) {

                mstWeight += e.weight;
                union(x, y);

                System.out.println(e.src + " - " + e.dest + " : " + e.weight);
            }
        }

        System.out.println("Minimum Cost = " + mstWeight);
    }
}