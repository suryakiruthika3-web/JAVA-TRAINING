import java.util.Scanner;
public class Problem04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number: ");
        int number = scanner.nextInt();
        if (number < 0) {
            System.out.println("Number cannot be negative.");
        } else if(number == 0) {
            System.out.println("The given number is zero.");
        } else if(number % 2 == 0) {
            System.out.println("The given number is even.");
        } else {
            System.out.println("The given number is odd.");
        }
    }
}
