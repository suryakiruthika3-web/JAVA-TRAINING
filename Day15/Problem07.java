import java.util.Arrays;
import java.util.List;

public class Problem07 {

    public static void main(String[] args) {

        List<Integer> numbers = Arrays.asList(45, 12, 89, 23, 67);

        System.out.println("Sorted Numbers:");

        numbers.stream()
               .sorted()
               .forEach(System.out::println);
    }
}