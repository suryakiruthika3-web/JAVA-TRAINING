import java.util.Scanner;
public class Problem10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a day: ");
        int day = scanner.nextInt();
        switch (day) {
            case 1, 7 -> System.out.println("Weekend");
            case 2, 3, 4, 5, 6 -> System.out.println("Weekdays");
            default -> System.out.println("Invalid day");
        }
    }
    
}
