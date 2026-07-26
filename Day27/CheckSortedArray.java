import java.util.Scanner;

public class CheckSortedArray {

    static boolean isSorted(int[] arr, int index) {
        if (index == arr.length - 1)
            return true;

        if (arr[index] > arr[index + 1])
            return false;

        return isSorted(arr, index + 1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter elements:");
        for (int i = 0; i < n; i++)
            arr[i] = sc.nextInt();

        if (isSorted(arr, 0))
            System.out.println("Array is Sorted");
        else
            System.out.println("Array is Not Sorted");

        sc.close();
    }
}