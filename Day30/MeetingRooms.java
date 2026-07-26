import java.util.Arrays;
import java.util.PriorityQueue;

public class MeetingRooms {

    public static int minMeetingRooms(int[][] intervals) {

        Arrays.sort(intervals, (a, b) -> a[0] - b[0]);

        PriorityQueue<Integer> pq = new PriorityQueue<>();

        for (int[] meeting : intervals) {

            if (!pq.isEmpty() && pq.peek() <= meeting[0]) {
                pq.poll();
            }

            pq.offer(meeting[1]);
        }

        return pq.size();
    }

    public static void main(String[] args) {

        int[][] meetings = {
                {0,30},
                {5,10},
                {15,20}
        };

        System.out.println(minMeetingRooms(meetings));
    }
}