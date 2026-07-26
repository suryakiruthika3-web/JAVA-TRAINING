import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class Problem13 {

    public static void main(String[] args) {

        List<String> names = Arrays.asList(
                "Alice",
                "Bob",
                "Charlie",
                "David"
        );

        Consumer<String> printName = name -> System.out.println(name);

        names.forEach(printName);
    }
}