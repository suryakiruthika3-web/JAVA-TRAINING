import java.util.PriorityQueue;

public class NearlySortedArray {

    public static void sort(int[] arr, int k) {

        PriorityQueue<Integer> pq = new PriorityQueue<>();

        int index = 0;

        for (int num : arr) {

            pq.offer(num);

            if (pq.size() > k) {
                arr[index++] = pq.poll();
            }
        }

        while (!pq.isEmpty()) {
            arr[index++] = pq.poll();
        }

        for (int x : arr)
            System.out.print(x + " ");
    }

    public static void main(String[] args) {

        int[] arr = {6,5,3,2,8,10,9};

        sort(arr,3);
    }
}