import java.util.ArrayList;
import java.util.Scanner;

public class Problem02 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        ArrayList<String> list = new ArrayList<>();

        list.add("Java");
        list.add("Python");
        list.add("C++");
        list.add("JavaScript");

        System.out.println("Original List: " + list);

        System.out.print("Enter element to remove: ");
        String item = sc.nextLine();

        if (list.remove(item))
            System.out.println("Element removed.");
        else
            System.out.println("Element not found.");

        System.out.println("Updated List: " + list);

        sc.close();
    }
}