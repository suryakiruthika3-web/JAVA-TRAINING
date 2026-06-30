import java.util.*;
public class Problem13 {
    void swap (int a, int b) {
        a = a + b;
        b = a - b;
        a = a - b;
        System.out.println("After Swapping: "+ a +" "+ b);
    }
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        Problem13 p = new Problem13();
        System.out.print("Enter a: ");
        int a = sc.nextInt();
        System.out.print("Enter b: ");
        int b = sc.nextInt();
        System.out.println("Before Swapping: "+ a +" "+ b);
        p.swap(a,b);
    }
}
