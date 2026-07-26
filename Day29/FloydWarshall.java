public class FloydWarshall {

    static final int INF = 99999;

    public static void main(String[] args) {

        int graph[][] = {
                {0, 3, INF, 7},
                {8, 0, 2, INF},
                {5, INF, 0, 1},
                {2, INF, INF, 0}
        };

        int V = graph.length;

        int dist[][] = new int[V][V];

        for (int i = 0; i < V; i++)
            for (int j = 0; j < V; j++)
                dist[i][j] = graph[i][j];

        for (int k = 0; k < V; k++)
            for (int i = 0; i < V; i++)
                for (int j = 0; j < V; j++)
                    if (dist[i][k] + dist[k][j] < dist[i][j])
                        dist[i][j] = dist[i][k] + dist[k][j];

        System.out.println("Shortest Distance Matrix:");

        for (int i = 0; i < V; i++) {

            for (int j = 0; j < V; j++)
                System.out.print(dist[i][j] + " ");

            System.out.println();
        }
    }
}