import java.util.Scanner;

class WeakPasswordException extends Exception {
    WeakPasswordException(String message) {
        super(message);
    }
}

public class Problem11 {

    static void validatePassword(String password)
            throws WeakPasswordException {

        if (password.length() < 8) {
            throw new WeakPasswordException(
                    "Password must contain at least 8 characters.");
        } else {
            System.out.println("Password is valid.");
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        try {
            System.out.print("Enter Password: ");
            String password = sc.nextLine();

            validatePassword(password);

        } catch (WeakPasswordException e) {
            System.out.println(e.getMessage());
        }

        sc.close();
    }
}