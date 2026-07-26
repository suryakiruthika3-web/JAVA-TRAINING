import java.util.LinkedList;
import java.util.Queue;

public class Problem09 {
    public static void main(String[] args) {

        Queue<String> queue = new LinkedList<>();

        queue.offer("Java");
        queue.offer("Python");
        queue.offer("C++");

        System.out.println("Queue: " + queue);

        System.out.println("Front Element: " + queue.peek());

        System.out.println("Removed: " + queue.poll());

        System.out.println("Queue after Poll: " + queue);
    }
}