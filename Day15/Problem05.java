import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class Problem05 {

    public static void main(String[] args) {

        List<Integer> numbers = Arrays.asList(12, 45, 78, 23, 56);

        Optional<Integer> max = numbers.stream().max(Integer::compareTo);

        if (max.isPresent()) {
            System.out.println("Maximum = " + max.get());
        }
    }
}