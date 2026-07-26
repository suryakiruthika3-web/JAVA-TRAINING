import java.util.Scanner;

public class Problem12 {

    static void validateMarks(int marks) {

        if (marks < 0 || marks > 100) {
            throw new IllegalArgumentException(
                    "Marks should be between 0 and 100.");
        }

        System.out.println("Valid Marks: " + marks);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        try {
            System.out.print("Enter Marks: ");
            int marks = sc.nextInt();

            validateMarks(marks);

        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }

        sc.close();
    }
}