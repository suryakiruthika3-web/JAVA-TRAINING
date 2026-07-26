import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;

public class Problem12 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        ArrayList<Integer> list = new ArrayList<>();

        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();

        System.out.println("Enter elements:");

        for (int i = 0; i < n; i++) {
            list.add(sc.nextInt());
        }

        System.out.println("Original List: " + list);

        HashSet<Integer> set = new HashSet<>(list);

        System.out.println("After Removing Duplicates:");
        System.out.println(set);

        sc.close();
    }
}