import java.util.*;

class Pair {
    int vertex, weight;

    Pair(int v, int w) {
        vertex = v;
        weight = w;
    }
}

public class PrimMST {

    public static void main(String[] args) {

        int V = 5;

        ArrayList<ArrayList<Pair>> graph = new ArrayList<>();

        for (int i = 0; i < V; i++)
            graph.add(new ArrayList<>());

        graph.get(0).add(new Pair(1, 2));
        graph.get(1).add(new Pair(0, 2));

        graph.get(0).add(new Pair(3, 6));
        graph.get(3).add(new Pair(0, 6));

        graph.get(1).add(new Pair(2, 3));
        graph.get(2).add(new Pair(1, 3));

        graph.get(1).add(new Pair(3, 8));
        graph.get(3).add(new Pair(1, 8));

        graph.get(1).add(new Pair(4, 5));
        graph.get(4).add(new Pair(1, 5));

        graph.get(2).add(new Pair(4, 7));
        graph.get(4).add(new Pair(2, 7));

        boolean[] visited = new boolean[V];

        PriorityQueue<Pair> pq = new PriorityQueue<>((a, b) -> a.weight - b.weight);

        pq.offer(new Pair(0, 0));

        int mstWeight = 0;

        while (!pq.isEmpty()) {

            Pair current = pq.poll();

            int node = current.vertex;

            if (visited[node])
                continue;

            visited[node] = true;
            mstWeight += current.weight;

            for (Pair nbr : graph.get(node))
                if (!visited[nbr.vertex])
                    pq.offer(new Pair(nbr.vertex, nbr.weight));
        }

        System.out.println("Minimum Cost = " + mstWeight);
    }
}