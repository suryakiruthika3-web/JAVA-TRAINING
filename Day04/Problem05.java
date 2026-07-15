import java.util.*;
public class Problem05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of elements: ");
        int n = scanner.nextInt();
        int sum = 0;
        System.out.println("The sum of elements from 1 to "+n+" is: ");
        for(int i=1;i<=n;i++){
                sum += i;
        }
        System.out.println(sum);
    }
}
