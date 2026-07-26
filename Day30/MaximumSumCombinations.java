import java.util.Collections;
import java.util.PriorityQueue;

public class MaximumSumCombinations {

    public static void maxSum(int[] A, int[] B, int k) {

        PriorityQueue<Integer> pq =
                new PriorityQueue<>(Collections.reverseOrder());

        for (int i = 0; i < A.length; i++) {
            for (int j = 0; j < B.length; j++) {
                pq.offer(A[i] + B[j]);
            }
        }

        while (k-- > 0 && !pq.isEmpty()) {
            System.out.print(pq.poll() + " ");
        }
    }

    public static void main(String[] args) {

        int[] A = {1,4,2};
        int[] B = {3,5,1};

        maxSum(A,B,4);
    }
}