import java.util.*;
public class Problem13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of elements: ");
        int n = scanner.nextInt();
        int a = 0;
        int b = 1;
        System.out.println("The Fibonacci series up to "+n+" terms is: ");
        for(int i=1;i<=n;i++){
            System.out.print(a+" ");
            int c = a + b;
            a = b;
            b = c;
        }
    }
}
