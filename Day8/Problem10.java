import java.util.*;
public class Problem10 {
    int fact (int n) {
        int factorial = 1;
        for(int i=1;i<=n;i++) {
            factorial *= i;
        }
        return factorial;
    }
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        Problem10 p = new Problem10();
        System.out.print("Enter n: ");
        int n = sc.nextInt();
        
        System.out.println(p.fact(n));
    }
}
