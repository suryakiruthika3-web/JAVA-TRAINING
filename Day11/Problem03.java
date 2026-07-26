import java.util.Scanner;

public class Problem03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            System.out.print("Enter a number: ");
            String str = sc.nextLine();

            int number = Integer.parseInt(str);

            System.out.println("Number = " + number);
        } catch (NumberFormatException e) {
            System.out.println("Error: Invalid number format.");
        }

        sc.close();
    }
}