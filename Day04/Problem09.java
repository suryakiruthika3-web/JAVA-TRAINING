import java.util.*;
public class Problem09 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of elements: ");
        int n = scanner.nextInt();
        int sum = 0;
        while(n>0){
            int num = n%10;
            sum += num;
            n = n/10;
        }
        System.out.println("The sum of elements from 1 to n is: "+sum);
    }
}
