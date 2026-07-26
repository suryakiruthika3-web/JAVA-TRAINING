import java.util.Scanner;

public class Problem05 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int[] arr = {5, 10, 15};

        try {
            System.out.print("Enter first number: ");
            int a = sc.nextInt();

            System.out.print("Enter second number: ");
            int b = sc.nextInt();

            int result = a / b;
            System.out.println("Division = " + result);

            System.out.print("Enter array index: ");
            int index = sc.nextInt();

            System.out.println("Element = " + arr[index]);

        } catch (ArithmeticException e) {
            System.out.println("Error: Division by zero.");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Error: Invalid array index.");
        }

        sc.close();
    }
}