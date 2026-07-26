import java.util.Scanner;

public class MaximumArray {

    static int maximum(int[] arr, int index) {
        if (index == arr.length - 1)
            return arr[index];

        return Math.max(arr[index], maximum(arr, index + 1));
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter elements:");
        for (int i = 0; i < n; i++)
            arr[i] = sc.nextInt();

        System.out.println("Maximum = " + maximum(arr, 0));

        sc.close();
    }
}