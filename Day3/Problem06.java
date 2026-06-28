import java.util.Scanner;
public class Problem06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a: ");
        int a = scanner.nextInt();
        System.out.print("Enter b: ");
        int b = scanner.nextInt();
        System.out.print("Enter c: ");
        int c = scanner.nextInt();
        if (a < b) {
            if (a < c) {
                System.out.println("The smallest number is: " + a);
            } else {
                System.out.println("The smallest number is: " + c);
            }
        } else {
            if (b < c) {
                System.out.println("The smallest number is: " + b);
            } else {
                System.out.println("The smallest number is: " + c);
            }

        }
    }
    
}
