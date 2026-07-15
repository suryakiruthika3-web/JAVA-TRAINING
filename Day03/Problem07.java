import java.util.Scanner;
public class Problem07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a: ");
        int a = scanner.nextInt();
        System.out.print("Enter b: ");
        int b = scanner.nextInt();
        System.out.print("Enter c: ");
        int c = scanner.nextInt();
        int largest= (a > b) ? ((a > c) ? a : c) : ((b > c) ? b : c);
        System.out.println("The largest number is: " + largest);
    }
}
