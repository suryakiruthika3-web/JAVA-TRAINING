import java.util.Stack;

public class NextGreaterElement {

    public static void main(String[] args) {

        int[] arr = {4, 5, 2, 10, 8};
        int[] ans = new int[arr.length];

        Stack<Integer> stack = new Stack<>();

        for (int i = arr.length - 1; i >= 0; i--) {

            while (!stack.isEmpty() && stack.peek() <= arr[i])
                stack.pop();

            ans[i] = stack.isEmpty() ? -1 : stack.peek();

            stack.push(arr[i]);
        }

        System.out.println("Next Greater Elements:");

        for (int x : ans)
            System.out.print(x + " ");
    }
}