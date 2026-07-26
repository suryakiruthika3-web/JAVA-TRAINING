import java.util.Scanner;

class NotEligibleToVoteException extends Exception {

    NotEligibleToVoteException(String message) {
        super(message);
    }
}

public class Problem13 {

    static void checkEligibility(int age)
            throws NotEligibleToVoteException {

        if (age < 18) {
            throw new NotEligibleToVoteException(
                    "You are not eligible to vote.");
        }

        System.out.println("You are eligible to vote.");
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        try {
            System.out.print("Enter Age: ");
            int age = sc.nextInt();

            checkEligibility(age);

        } catch (NotEligibleToVoteException e) {
            System.out.println(e.getMessage());
        }

        sc.close();
    }
}