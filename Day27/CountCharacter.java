import java.util.Scanner;

public class CountCharacter {

    static int count(String str, char ch, int index) {

        if (index == str.length())
            return 0;

        if (str.charAt(index) == ch)
            return 1 + count(str, ch, index + 1);

        return count(str, ch, index + 1);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter String: ");
        String str = sc.nextLine();

        System.out.print("Enter Character: ");
        char ch = sc.next().charAt(0);

        System.out.println("Occurrences = " + count(str, ch, 0));

        sc.close();
    }
}