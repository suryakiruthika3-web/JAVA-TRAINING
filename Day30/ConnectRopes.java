import java.util.PriorityQueue;

public class ConnectRopes {

    public static int minCost(int[] ropes) {

        PriorityQueue<Integer> pq = new PriorityQueue<>();

        for (int rope : ropes) {
            pq.offer(rope);
        }

        int cost = 0;

        while (pq.size() > 1) {

            int first = pq.poll();
            int second = pq.poll();

            int sum = first + second;
            cost += sum;

            pq.offer(sum);
        }

        return cost;
    }

    public static void main(String[] args) {

        int[] ropes = {4, 3, 2, 6};

        System.out.println(minCost(ropes));
    }
}