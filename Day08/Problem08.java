import java.util.*;
public class Problem08 {
    void OddorEven (int n) {
        if( n % 2 == 0 ) {
            System.out.println("The given number is even");
        } else {
            System.out.println("The given number is odd");
        }
    }
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        Problem08 p = new Problem08();
        int n = sc.nextInt();
        p.OddorEven(n);
    }
}
