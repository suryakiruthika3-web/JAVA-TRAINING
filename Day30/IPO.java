import java.util.*;

public class IPO {

    public static int findMaxCapital(int k, int w, int[] profits, int[] capital) {

        int n = profits.length;

        int[][] projects = new int[n][2];

        for (int i = 0; i < n; i++) {
            projects[i][0] = capital[i];
            projects[i][1] = profits[i];
        }

        Arrays.sort(projects, (a, b) -> a[0] - b[0]);

        PriorityQueue<Integer> maxHeap =
                new PriorityQueue<>(Collections.reverseOrder());

        int i = 0;

        while (k-- > 0) {

            while (i < n && projects[i][0] <= w) {
                maxHeap.offer(projects[i][1]);
                i++;
            }

            if (maxHeap.isEmpty())
                break;

            w += maxHeap.poll();
        }

        return w;
    }

    public static void main(String[] args) {

        int[] profits = {1,2,3};
        int[] capital = {0,1,1};

        System.out.println(findMaxCapital(2,0,profits,capital));
    }
}