import java.util.*;
public class Problem06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of elements: ");
        int n = scanner.nextInt();
        int product = 1;
        System.out.println("The product of elements from 1 to "+n+" is: ");
        for(int i=1;i<=n;i++){
                product *= i;
        }
        System.out.println(product);
    }
}
