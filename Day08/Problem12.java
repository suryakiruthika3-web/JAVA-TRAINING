import java.util.*;
public class Problem12 {
    int rev(int n) {
        int rev = 0;
        while(n>0) {
            rev *= 10;
            rev += n %10;
            n /= 10;
        }
        return rev;
    }
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        Problem12 p = new Problem12();
        System.out.print("Enter n: ");
        int n = sc.nextInt();
        int original = n;
        int rev = p.rev(n);
        if(original == rev) {
            System.out.println("The given number is a Palindrome");
        }
        else {
            System.out.println("The given number is not a Palindrome");
        }
    }
}
