import java.util.*;
public class Problem10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of elements: ");
        int n = scanner.nextInt();
        int rev = 0;
        while (n>0){
            int num = n%10;
            rev = rev*10 + num;
            n = n/10;
        }
        System.out.println(rev);
    }
}
