import java.util.*;
public class Problem08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number: ");
        long n = scanner.nextLong();
        long count = 0;
        
        while(n>0){
            n = n/10;
            count++;
        }
        System.out.println(count);
    }
}
