import java.util.Scanner;
public class Problem02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number: ");
        int number = scanner.nextInt();
        if (number < 0) {
            System.out.println("Number cannot be negative.");
        } else {
            System.out.println("You entered: " + number);
        }
    }
}
