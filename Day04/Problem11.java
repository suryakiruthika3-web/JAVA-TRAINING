import java.util.*;
public class Problem11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of elements: ");
        int n = scanner.nextInt();
        int original = n;
        int rev = 0;
        while (n>0){
            int num = n%10;
            rev = rev*10 + num;
            n = n/10;
        }
        if (original == rev){
            System.out.println("The number is a palindrome.");
        } else {
            System.out.println("The number is not a palindrome.");
        }
    }
}
