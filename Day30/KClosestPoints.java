import java.util.PriorityQueue;

public class KClosestPoints {

    public static int[][] kClosest(int[][] points, int k) {

        PriorityQueue<int[]> pq = new PriorityQueue<>(
                (a, b) -> (b[0]*b[0] + b[1]*b[1]) - (a[0]*a[0] + a[1]*a[1]));

        for (int[] point : points) {

            pq.offer(point);

            if (pq.size() > k) {
                pq.poll();
            }
        }

        int[][] ans = new int[k][2];

        for (int i = 0; i < k; i++) {
            ans[i] = pq.poll();
        }

        return ans;
    }

    public static void main(String[] args) {

        int[][] points = {{1,3},{-2,2}};
        int k = 1;

        int[][] result = kClosest(points, k);

        for (int[] p : result) {
            System.out.println(p[0] + " " + p[1]);
        }
    }
}