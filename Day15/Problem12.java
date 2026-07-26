import java.util.function.Predicate;

public class Problem12 {

    public static void main(String[] args) {

        Predicate<Integer> isEven = n -> n % 2 == 0;

        int number = 12;

        if (isEven.test(number)) {
            System.out.println(number + " is Even");
        } else {
            System.out.println(number + " is Odd");
        }
    }
}