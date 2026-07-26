import java.util.Stack;

public class Problem08 {
    public static void main(String[] args) {

        Stack<Integer> stack = new Stack<>();

        stack.push(10);
        stack.push(20);
        stack.push(30);

        System.out.println("Stack: " + stack);

        System.out.println("Top Element: " + stack.peek());

        System.out.println("Removed: " + stack.pop());

        System.out.println("Stack after Pop: " + stack);
    }
}