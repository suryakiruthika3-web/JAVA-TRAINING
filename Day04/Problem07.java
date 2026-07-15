import java.util.*;
public class Problem07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of elements: ");
        int n = scanner.nextInt();
        System.out.println("Multiplication of table " + n + " is: ");
        for(int i=1;i<=10;i++){
                int result = n * i;
                System.out.println(n + " * " + i + " = " + result);
        }
    }
}
