import java.util.Scanner;

public class Problem04 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        int count = 0;

        for (int i = 0; i < n; i++) {

            arr[i] = sc.nextInt();

            if (arr[i] % 2 == 0) {
                count++;
            }
        }

        System.out.println("Even Numbers = " + count);

        sc.close();
    }
}