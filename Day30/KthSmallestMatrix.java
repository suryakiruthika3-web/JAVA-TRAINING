import java.util.PriorityQueue;

public class KthSmallestMatrix {

    public static int kthSmallest(int[][] matrix, int k) {

        PriorityQueue<Integer> pq = new PriorityQueue<>((a, b) -> b - a);

        for (int[] row : matrix) {

            for (int num : row) {

                pq.offer(num);

                if (pq.size() > k) {
                    pq.poll();
                }
            }
        }

        return pq.peek();
    }

    public static void main(String[] args) {

        int[][] matrix = {
                {1,5,9},
                {10,11,13},
                {12,13,15}
        };

        System.out.println(kthSmallest(matrix, 8));
    }
}