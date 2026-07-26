import java.util.Scanner;

public class Problem07 {

    static void checkAge(int age) {
        if (age < 18) {
            throw new IllegalArgumentException("You must be at least 18 years old.");
        } else {
            System.out.println("You are eligible.");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            System.out.print("Enter your age: ");
            int age = sc.nextInt();

            checkAge(age);

        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }

        sc.close();
    }
}