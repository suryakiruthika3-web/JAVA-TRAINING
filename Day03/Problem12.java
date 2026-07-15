import java.util.Scanner;
public class Problem12 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of a and b: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println("Enter the Operator: 1. + 2. - 3. * 4. / 5. %");
        sc.nextLine();
        String operator = sc.nextLine();
        switch (operator) {
            case "+":
                System.out.println("Addition of a and b: " +(a+b));
                break;
            case "-":
                System.out.println("subtraction of a and b: " +(a-b));
                break;
            case "*":
                System.out.println("Multiplication of a and b: " +(a*b));
                break;
            case "/":
                System.out.println("Division of a and b: " +(a/b));
                break;
            case "%":
                System.out.println("Modulus of a and b: " +(a%b));
                break;
            
        }
    }
}
