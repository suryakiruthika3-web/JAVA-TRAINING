import java.util.Scanner;
public class Problem11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("=====DISPLAY MENU=====");
        System.out.println("1. Coffee");
        System.out.println("2. Tea");   
        System.out.println("3. Juice");
        System.out.println("4. Water");
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        
        switch (number) {
            case 1 -> System.out.println("You selected Coffee");
            case 2 -> System.out.println("You selected Tea");
            case 3 -> System.out.println("You selected Juice");
            case 4 -> System.out.println("You selected Water");
            default -> System.out.println("Invalid option entered. Please select a valid option from the menu.");
        }
        System.out.println("=====END OF MENU=====");
    }
}
