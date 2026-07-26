import java.util.Scanner;

public class Problem08 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String str = sc.nextLine();

        System.out.println(str.replace(" ", ""));

        sc.close();
    }
}