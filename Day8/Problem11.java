import java.util.*;
public class Problem11 {
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
        Problem11 p = new Problem11();
        System.out.print("Enter n: ");
        int n = sc.nextInt();
        
        System.out.println(p.rev(n));
    }
}
