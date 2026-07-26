import java.util.Stack;

public class NextSmallerElement {

    public static void main(String[] args) {

        int[] arr = {4, 8, 5, 2, 25};
        int[] ans = new int[arr.length];

        Stack<Integer> stack = new Stack<>();

        for (int i = arr.length - 1; i >= 0; i--) {

            while (!stack.isEmpty() && stack.peek() >= arr[i])
                stack.pop();

            ans[i] = stack.isEmpty() ? -1 : stack.peek();

            stack.push(arr[i]);
        }

        System.out.println("Next Smaller Elements:");

        for (int x : ans)
            System.out.print(x + " ");
    }
}