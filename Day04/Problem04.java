import java.util.*;
public class Problem04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of elements: ");
        int n = scanner.nextInt();
        System.out.println("The odd numbers from 1 to "+n+" are: ");
        for(int i=1;i<=n;i++){
                if (i%2!=0){
                    System.out.print(i+" ");
                }
        }
    }
}
