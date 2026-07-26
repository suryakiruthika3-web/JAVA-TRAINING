import java.util.Stack;

public class MinStack {

    Stack<Integer> stack = new Stack<>();
    Stack<Integer> minStack = new Stack<>();

    public void push(int x) {

        stack.push(x);

        if (minStack.isEmpty() || x <= minStack.peek())
            minStack.push(x);
    }

    public void pop() {

        if (stack.peek().equals(minStack.peek()))
            minStack.pop();

        stack.pop();
    }

    public int top() {
        return stack.peek();
    }

    public int getMin() {
        return minStack.peek();
    }

    public static void main(String[] args) {

        MinStack s = new MinStack();

        s.push(5);
        s.push(2);
        s.push(8);
        s.push(1);

        System.out.println("Minimum = " + s.getMin());

        s.pop();

        System.out.println("Top = " + s.top());
        System.out.println("Minimum = " + s.getMin());
    }
}