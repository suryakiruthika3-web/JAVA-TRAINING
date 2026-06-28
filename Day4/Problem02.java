import java.util.*;
public class Problem02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of elements: ");
        int n = scanner.nextInt();
        for(int i=n;i>=1;i--){
                System.out.print(i+" ");
        }
    }
}
