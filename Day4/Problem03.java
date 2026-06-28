import java.util.*;
public class Problem03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of elements: ");
        int n = scanner.nextInt();
        System.out.println("The even numbers from 1 to "+n+" are: ");
        for(int i=1;i<=n;i++){
                if (i%2==0){
                    System.out.print(i+" ");
                }
        }
    }
}
