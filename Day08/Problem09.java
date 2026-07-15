import java.util.*;
public class Problem09 {
    int maximum (int a, int b) {
        if(a > b) {
            return a;
        } else {
            return b;
        }
    }
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        Problem09 p = new Problem09();
        System.out.print("Enter a: ");
        int a = sc.nextInt();
        System.out.print("Enter b: ");
        int b = sc.nextInt();
        System.out.println(p.maximum(a,b));
    }
}
