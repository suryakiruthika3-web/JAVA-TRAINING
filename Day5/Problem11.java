import java.util. *;
public class Problem11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = scanner.nextInt();
        for(int i=1;i<=n;i++) {
            for(int j=1;j<=i-1;j++) {
                System.out.print(" ");
            }
            for(int k=1;k<=2*(n-i)+1;k++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
