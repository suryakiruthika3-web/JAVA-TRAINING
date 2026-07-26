import java.util.*;

class Pair {
    int vertex, weight;

    Pair(int vertex, int weight) {
        this.vertex = vertex;
        this.weight = weight;
    }
}

public class Dijkstra {

    public static void main(String[] args) {

        int V = 5;

        ArrayList<ArrayList<Pair>> graph = new ArrayList<>();

        for (int i = 0; i < V; i++)
            graph.add(new ArrayList<>());

        graph.get(0).add(new Pair(1, 2));
        graph.get(0).add(new Pair(2, 4));

        graph.get(1).add(new Pair(2, 1));
        graph.get(1).add(new Pair(3, 7));

        graph.get(2).add(new Pair(4, 3));

        graph.get(3).add(new Pair(4, 1));

        PriorityQueue<Pair> pq = new PriorityQueue<>((a, b) -> a.weight - b.weight);

        int[] dist = new int[V];
        Arrays.fill(dist, Integer.MAX_VALUE);

        dist[0] = 0;
        pq.offer(new Pair(0, 0));

        while (!pq.isEmpty()) {

            Pair cur = pq.poll();

            int node = cur.vertex;
            int wt = cur.weight;

            for (Pair nbr : graph.get(node)) {

                if (wt + nbr.weight < dist[nbr.vertex]) {

                    dist[nbr.vertex] = wt + nbr.weight;
                    pq.offer(new Pair(nbr.vertex, dist[nbr.vertex]));
                }
            }
        }

        System.out.println("Shortest distances:");
        System.out.println(Arrays.toString(dist));
    }
}