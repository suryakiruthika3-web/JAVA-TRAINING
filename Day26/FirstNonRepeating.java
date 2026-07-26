import java.util.LinkedList;
import java.util.Queue;

public class FirstNonRepeating {

    public static void main(String[] args) {

        String stream = "aabc";

        int[] freq = new int[26];

        Queue<Character> queue = new LinkedList<>();

        for (char ch : stream.toCharArray()) {

            freq[ch - 'a']++;

            queue.offer(ch);

            while (!queue.isEmpty() && freq[queue.peek() - 'a'] > 1)
                queue.poll();

            if (queue.isEmpty())
                System.out.print("-1 ");
            else
                System.out.print(queue.peek() + " ");
        }
    }
}