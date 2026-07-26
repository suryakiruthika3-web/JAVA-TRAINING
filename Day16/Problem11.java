import java.util.Scanner;

public class Problem11 {

    public static int linearSearch(int[] arr, int key) {

        for (int i = 0; i < arr.length; i++) {

            if (arr[i] == key)
                return i;
        }

        return -1;
    }

    public static int binarySearch(int[] arr, int key) {

        int left = 0;
        int right = arr.length - 1;

        while (left <= right) {

            int mid = (left + right) / 2;

            if (arr[mid] == key)
                return mid;

            if (arr[mid] < key)
                left = mid + 1;
            else
                right = mid - 1;
        }

        return -1;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int[] arr = {10, 20, 30, 40, 50, 60, 70};

        System.out.print("Enter element to search: ");
        int key = sc.nextInt();

        int linear = linearSearch(arr, key);
        int binary = binarySearch(arr, key);

        System.out.println("Linear Search Index : " + linear);
        System.out.println("Binary Search Index : " + binary);

        System.out.println("\nTime Complexity:");
        System.out.println("Linear Search : O(n)");
        System.out.println("Binary Search : O(log n)");

        sc.close();
    }
}