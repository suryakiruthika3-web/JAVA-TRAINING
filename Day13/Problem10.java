import java.util.PriorityQueue;

public class Problem10 {
    public static void main(String[] args) {

        PriorityQueue<Integer> pq = new PriorityQueue<>();

        pq.offer(50);
        pq.offer(10);
        pq.offer(30);
        pq.offer(20);
        pq.offer(40);

        System.out.println("Priority Queue: " + pq);

        while (!pq.isEmpty()) {
            System.out.println("Removed: " + pq.poll());
        }
    }
}