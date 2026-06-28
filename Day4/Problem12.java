import java.util.*;
public class Problem12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of elements: ");
        int n = scanner.nextInt();

        System.out.println("The factorial of "+n+" is: "); 
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n;j++){
                System.out.print(i+""+j+" ");
            }
            System.out.println();
        }
    }
}
