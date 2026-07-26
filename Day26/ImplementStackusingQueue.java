import java.util.LinkedList;
import java.util.Queue;

public class ImplementStackusingQueue {

    Queue<Integer> q = new LinkedList<>();

    public void push(int x) {
        q.offer(x);

        for (int i = 0; i < q.size() - 1; i++) {
            q.offer(q.poll());
        }
    }

    public int pop() {
        if (q.isEmpty()) {
            System.out.println("Stack Underflow");
            return -1;
        }
        return q.poll();
    }

    public int top() {
        if (q.isEmpty())
            return -1;
        return q.peek();
    }

    public boolean isEmpty() {
        return q.isEmpty();
    }

    public static void main(String[] args) {

        ImplementStackusingQueue s = new ImplementStackusingQueue();

        s.push(10);
        s.push(20);
        s.push(30);

        System.out.println("Top = " + s.top());
        System.out.println("Pop = " + s.pop());
        System.out.println("Top = " + s.top());
    }
}